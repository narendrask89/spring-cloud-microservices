package com.nandu.it.labs.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NanduSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NanduSpringCloudConfigServerApplication.class, args);
	}

}
