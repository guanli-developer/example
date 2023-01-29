package example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import example.model.Source;
import example.model.Target;
import example.util.GenderConverter;

@Mapper(componentModel = "spring", imports = { GenderConverter.class })
public interface StaticExpressionMapper {

	@Mappings({
			@Mapping(expression = "java(GenderConverter.convert(source.getGender()))", target = "gender") })
	Target sourceToTarget(Source source);

}
