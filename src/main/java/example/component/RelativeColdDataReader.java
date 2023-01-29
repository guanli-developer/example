package example.component;

import org.springframework.stereotype.Component;

import example.model.ColdDataDemo;
import tech.guanli.boot.data.redis.plus.component.relative.ObjectReader;

@Component
public class RelativeColdDataReader extends ObjectReader<ColdDataDemo, Void> {

	@Override
	protected ColdDataDemo readCodeData(Void parameter) {
		ColdDataDemo coldDataDemo = new ColdDataDemo();
		coldDataDemo.setHello("relative world");
		return coldDataDemo;
	}

}
