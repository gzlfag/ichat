package org.ichat.front.config;

import org.ichat.domain.config.IChatDomainConfig;
import org.ichat.service.config.IChatServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({IChatServiceConfig.class, IChatDomainConfig.class})
public class IChatConfig {

}
