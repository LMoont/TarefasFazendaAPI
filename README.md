# Gerenciamento de Tarefas - API

Este repositório contém a API de gerenciamento de tarefas para uma aplicação que gerencia tarefas de funcionários em uma fazenda. A API permite listar e adicionar tarefas, incluindo informações como título, descrição, status, prioridade, e prazos.

## Estrutura do Projeto

### 1. `TarefaController`

A classe `TarefaController` é responsável por expor os endpoints para interação com as tarefas. Ela permite listar todas as tarefas e adicionar novas tarefas.

#### Endpoint
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

Acesse a API via http://localhost:8080/tarefasnts

- **GET /tarefas**: Retorna uma lista de todas as tarefas cadastradas.
- **POST /tarefas**: Adiciona uma nova tarefa.

### Como Rodar
Clone o repositório.
Configure o banco de dados e a conexão no application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/nomedobanco
spring.datasource.username=usuario
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
