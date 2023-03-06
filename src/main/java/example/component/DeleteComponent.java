package example.component;

import org.springframework.stereotype.Component;

import tech.guanli.boot.data.mybatis.plus.dml.history.storage.mongo.component.AbstractDeleteHistoryMongoStorage;

@Component
public class DeleteComponent extends AbstractDeleteHistoryMongoStorage {

	@Override
	protected Object setOperator(Object operator) {
		return "deleter";
	}

}
