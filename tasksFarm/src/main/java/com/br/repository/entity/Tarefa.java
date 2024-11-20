	package com.br.repository.entity;

	import com.fasterxml.jackson.annotation.JsonBackReference;
	import jakarta.persistence.*;
	import java.time.LocalDateTime;
	import java.time.LocalDate;

	@Entity
	@Table(name = "tb_tarefa")
	public class Tarefa {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "tarefa_id")
		private int tarefaId;

		@ManyToOne // Relacionamento com Funcionario
		@JoinColumn(name = "funcionario_id", referencedColumnName = "funcionario_id", nullable = false) // Chave estrangeira
		@JsonBackReference  // Evita a serialização recursiva
		private Funcionario funcionario;  // O funcionário que gerencia a tarefa

		@Column(name = "titulo")
		private String titulo;

		@Column(name = "descricao")
		private String descricao;

		@Column(name = "data_limite")
		private LocalDate dataLimite;

		@Column(name = "data_criacao")
		private LocalDateTime dataCriacao;

		@Column(name = "data_conclusao")
		private LocalDateTime dataConclusao;

		@Column(name = "status")
		private String status;

		@Column(name = "prioridade")
		private String prioridade;

		// Construtor público sem argumentos (necessário para o Spring/JPA)
		public Tarefa() {
			// Construtor padrão necessário para JPA
		}

		// Getters e Setters
		public int getTarefaId() {
			return tarefaId;
		}

		public void setTarefaId(int tarefaId) {
			this.tarefaId = tarefaId;
		}

		public Funcionario getFuncionario() {
			return funcionario;
		}

		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public LocalDate getDataLimite() {
			return dataLimite;
		}

		public void setDataLimite(LocalDate dataLimite) {
			this.dataLimite = dataLimite;
		}

		public LocalDateTime getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(LocalDateTime dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public LocalDateTime getDataConclusao() {
			return dataConclusao;
		}

		public void setDataConclusao(LocalDateTime dataConclusao) {
			this.dataConclusao = dataConclusao;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPrioridade() {
			return prioridade;
		}

		public void setPrioridade(String prioridade) {
			this.prioridade = prioridade;
		}

		// Construtor privado para o Builder
		private Tarefa(Builder builder) {
			this.tarefaId = builder.tarefaId;
			this.funcionario = builder.funcionario;
			this.titulo = builder.titulo;
			this.descricao = builder.descricao;
			this.dataLimite = builder.dataLimite;
			this.dataCriacao = builder.dataCriacao;
			this.dataConclusao = builder.dataConclusao;
			this.status = builder.status;
			this.prioridade = builder.prioridade;
		}

		// Builder class
		public static class Builder {
			private int tarefaId;
			private Funcionario funcionario;
			private String titulo;
			private String descricao;
			private LocalDate dataLimite;
			private LocalDateTime dataCriacao;
			private LocalDateTime dataConclusao;
			private String status;
			private String prioridade;

			public Builder tarefaId(int tarefaId) {
				this.tarefaId = tarefaId;
				return this;
			}

			public Builder funcionario(Funcionario funcionario) {
				this.funcionario = funcionario;
				return this;
			}

			public Builder titulo(String titulo) {
				this.titulo = titulo;
				return this;
			}

			public Builder descricao(String descricao) {
				this.descricao = descricao;
				return this;
			}

			public Builder dataLimite(LocalDate dataLimite) {
				this.dataLimite = dataLimite;
				return this;
			}

			public Builder dataCriacao(LocalDateTime dataCriacao) {
				this.dataCriacao = dataCriacao;
				return this;
			}

			public Builder dataConclusao(LocalDateTime dataConclusao) {
				this.dataConclusao = dataConclusao;
				return this;
			}

			public Builder status(String status) {
				this.status = status;
				return this;
			}

			public Builder prioridade(String prioridade) {
				this.prioridade = prioridade;
				return this;
			}

			// Método para criar o objeto Tarefa
			public Tarefa build() {
				return new Tarefa(this);
			}
		}
	}
