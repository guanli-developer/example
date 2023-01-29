package example.util;

public class GenderConverter {

	public static String convert(Integer gender) {
		switch (gender) {
		case 1:
			return "male";
		case 2:
			return "female";
		default:
			return "unknown";
		}
	}
}
