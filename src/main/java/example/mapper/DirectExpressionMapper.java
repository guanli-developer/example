package example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import example.model.Source;
import example.model.Target;

@Mapper(componentModel = "spring")
public interface DirectExpressionMapper {

	@Mappings({ @Mapping(expression = "java(source.getGender() == 1?\"male\":\"female\")", target = "gender") })
	public Target sourceToTarget(Source source);

}
