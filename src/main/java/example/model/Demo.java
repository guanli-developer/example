package example.model;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class Demo {

	@TableId
	private Long id;

	private String name;

	private Date time;

	private BigDecimal money;

}
