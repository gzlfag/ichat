package org.ichat.service.config;

import org.ichat.domain.config.DomainConfig;
import org.ichat.domain.config.IChatCassandraConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"org.ichat.service.serviceImpl"})
@Import({IChatCassandraConfig.class, DomainConfig.class})
public class ServiceTestConfig {
	
}
