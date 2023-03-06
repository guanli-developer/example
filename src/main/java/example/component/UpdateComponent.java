package example.component;

import org.springframework.stereotype.Component;

import tech.guanli.boot.data.mybatis.plus.dml.history.storage.mongo.component.AbstractUpdateHistoryMongoStorage;

@Component
public class UpdateComponent extends AbstractUpdateHistoryMongoStorage {

	@Override
	protected Object setOperator(Object operator) {
		return "updater";
	}

}
