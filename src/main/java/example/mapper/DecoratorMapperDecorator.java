package example.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import example.component.SomeComponent;
import example.model.Source;
import example.model.Target;

public abstract class DecoratorMapperDecorator implements DecoratorMapper {

	@Autowired
	private SomeComponent someComponent;

	@Autowired
	@Qualifier("delegate")
	private DecoratorMapper decoratorMapper;

	@Override
	public Target sourceToTarget(Source source) {
		Target target = decoratorMapper.sourceToTarget(source);
		someComponent.doSomething();
		return target;
	}

}
