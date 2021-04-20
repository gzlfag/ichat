package org.ichat.front;

import org.ichat.front.config.IChatConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(IChatConfig.class)
public class IChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(IChatApplication.class, args);
	}

}
