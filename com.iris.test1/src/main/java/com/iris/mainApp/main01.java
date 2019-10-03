package com.iris.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableAutoConfiguration
@EntityScan("com.iris.entities")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= {"com.iris.repository"})
@ComponentScan({"com.iris,controllers","com.iris.service","com.iris.Daos"})
public class main01 {

	
	public static void main(String[] args) {
		SpringApplication.run(main01.class, args);

	}

}
