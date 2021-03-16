package com.example.demo;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {
	//private static final Logger LOGGER=LoggerFactory.getLogger(DemoApplication.class);
	//private static final Logger logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");
	//private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		
//		logger.debug(" Debug Message");
//		logger.error(" Error Message");
//		LOGGER.error("Message logged at ERROR level");
//		LOGGER.warn("Message logged at WARN level");
//		LOGGER.info("Message logged at INFO level");
//		LOGGER.debug("Message logged at DEBUG level");
		
	}
	
	
	@RequestMapping("/")
	public String welcome(){
		return "Hello World!!";
	}

}
