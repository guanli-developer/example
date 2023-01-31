package example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import tech.guanli.boot.data.redis.plus.component.implement.SimpleAbsoluteStringReader;
import tech.guanli.boot.data.redis.plus.component.implement.SimpleRelativeStringReader;

@Component
public class Demo {
	@Autowired
	private SimpleAbsoluteStringReader simpleAbsoluteStringReader;

	@Autowired
	private SimpleRelativeStringReader simpleRelativeStringReader;

	@Autowired
	private AbsoluteColdDataReader absoluteColdDataReader;

	@Autowired
	private RelativeColdDataReader relativeColdDataReader;

	@Autowired
	private AbsoluteSerializableColdDataReader absoluteSerializableColdDataReader;

	@Autowired
	private RelativeSerializableColdDataReader relativeSerializableColdDataReader;

	@PostConstruct
	public void redis() {
		System.out.println(simpleAbsoluteStringReader.getAndSetIfAbsent("absolute:string:key", null, 60L));
		System.out.println(simpleRelativeStringReader.getAndSetIfAbsent("relative:string:key", null, 60L));
		System.out.println(absoluteColdDataReader.getAndSetIfAbsent("absolute:object:key", null, 60L));
		System.out.println(relativeColdDataReader.getAndSetIfAbsent("relative:object:key", null, 60L));
		System.out
				.println(absoluteSerializableColdDataReader.getObjectAndSetIfAbsent("absolute:object:key", null, 60L));
		System.out
				.println(relativeSerializableColdDataReader.getObjectAndSetIfAbsent("relative:object:key", null, 60L));
	}
}
