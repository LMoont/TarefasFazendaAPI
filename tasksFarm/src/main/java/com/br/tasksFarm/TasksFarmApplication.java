package com.br.tasksFarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.br")
@EnableJpaRepositories(basePackages = "com.br.repository")
@EntityScan("com.br.repository")
public class TasksFarmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksFarmApplication.class, args);
	}

}
