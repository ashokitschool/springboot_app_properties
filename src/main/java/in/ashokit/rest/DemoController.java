package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Value;

public class DemoController {
	
	@Value("${welcomeMsg}")
	private String wmsg;

	@Value("${greetMsg}")
	private String gmsg;

}
