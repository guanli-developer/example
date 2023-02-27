package example.component;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(value = { ExampleComponent.class }, ignored = { DefaultExampleComponent.class })
public class DefaultExampleComponent implements ExampleComponent {

	@Override
	public void whoAmI() {
		System.out.println("I'm default.");
	}

}
