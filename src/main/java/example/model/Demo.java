package example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class Demo {

	@TableId
	private Long id;

	private String name;

	private LocalDateTime dataTime;

	private BigDecimal money;

}
