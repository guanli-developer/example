package example.component;

import org.springframework.stereotype.Component;

@Component
public class AnotherExampleComponent implements ExampleComponent {

	@Override
	public void whoAmI() {
		System.out.println("I'm another.");
	}

}
