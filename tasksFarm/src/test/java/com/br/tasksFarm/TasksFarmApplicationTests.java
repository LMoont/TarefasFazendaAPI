package com.br.tasksFarm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active=test")
class TasksFarmApplicationTests {
	@Test
	void contextLoads() {
		// Verificar se o contexto carrega corretamente
	}
}

