package example.component;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import example.mapper.DemoMapper;
import example.model.Demo;

@RestController
public class DemoController {

	@Autowired
	private DemoMapper demoMapper;

	@GetMapping("/demo")
	public String demo() {
		Demo demo = new Demo();
		demo.setMoney(BigDecimal.valueOf(99.99D));
		demo.setName("hello");
		demo.setTime(new Date());
		demoMapper.insert(demo);
		demo.setName("hello update");
		demoMapper.updateById(demo);
		demoMapper.deleteById(demo.getId());
		return "success";
	}

}
