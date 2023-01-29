package example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {

	@GetMapping("/log")
	public String log() {
		log.info("info log");
		log.warn("warn log");
		log.error("error log");
		return "ok";
	}

}
