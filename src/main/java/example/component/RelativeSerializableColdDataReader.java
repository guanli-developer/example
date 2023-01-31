package example.component;

import org.springframework.stereotype.Component;

import example.model.ColdDataDemo;
import tech.guanli.boot.data.redis.plus.component.relative.SerializableObjectReader;

@Component
public class RelativeSerializableColdDataReader extends SerializableObjectReader<ColdDataDemo, Void> {

	@Override
	protected Class<ColdDataDemo> getColdDataClass() {
		return ColdDataDemo.class;
	}

	@Override
	protected ColdDataDemo readCodeData(Void parameter) {
		ColdDataDemo coldDataDemo = new ColdDataDemo();
		coldDataDemo.setHello("relative world");
		return coldDataDemo;
	}

}
