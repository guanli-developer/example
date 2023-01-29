package example.component;

import org.springframework.stereotype.Component;

import example.model.ColdDataDemo;
import tech.guanli.boot.data.redis.plus.component.absolute.ObjectReader;

@Component
public class AbsoluteColdDataReader extends ObjectReader<ColdDataDemo, Void> {

	@Override
	protected ColdDataDemo readCodeData(Void parameter) {
		ColdDataDemo coldDataDemo = new ColdDataDemo();
		coldDataDemo.setHello("absolute world");
		return coldDataDemo;
	}
}
