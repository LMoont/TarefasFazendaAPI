package com.br.tasksFarm;

import com.br.repository.entity.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.br")
@EnableJpaRepositories(basePackages = "com.br.repository")
@EntityScan("com.br.repository")
public class TasksFarmApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(TasksFarmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM tbTarefa";
		List<Tarefa> tarefas = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(Tarefa.class));
		tarefas.forEach(System.out :: println);
	}
}
