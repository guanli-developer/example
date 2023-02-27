package example.component;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo implements InitializingBean {

	@Autowired
	private ExampleComponent exampleComponent;

	@Override
	public void afterPropertiesSet() throws Exception {
		exampleComponent.whoAmI();
	}

}
