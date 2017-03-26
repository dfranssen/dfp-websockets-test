package be.ditavision.app;

import org.springframework.context.annotation.Configuration;

/**
 * Created by dfranssen on 05/03/2017.
 */

@Configuration
public class ChatConfig {

	public static class Destinations {
		private Destinations() {
		}

		private static final String LOGIN = "/topic/chat.login";
		private static final String LOGOUT = "/topic/chat.logout";
	}

}
