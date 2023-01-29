package example.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import example.model.Source;
import example.model.Target;

@Mapper(componentModel = "spring")
@DecoratedWith(DecoratorMapperDecorator.class)
public interface DecoratorMapper {

	Target sourceToTarget(Source source);

//	Target sourceToTargetWithOutDecorate(Source source);

}
