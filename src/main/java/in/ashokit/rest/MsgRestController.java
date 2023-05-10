package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.constants.AppConstants;
import in.ashokit.props.AppProperties;

@RestController
public class MsgRestController {

	@Autowired
	private AppProperties appProps;

	@GetMapping("/greet")
	public String getGreetMsg() {
		return appProps.getMessages()
					   .get(AppConstants.GREET_MSG_KEY);
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return appProps.getMessages()
					   .get(AppConstants.WELCOME_MSG_KEY);
	}

}




