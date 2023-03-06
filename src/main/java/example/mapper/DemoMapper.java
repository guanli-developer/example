package example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import example.model.Demo;

@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

}
