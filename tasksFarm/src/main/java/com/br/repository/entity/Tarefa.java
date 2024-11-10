package com.br.repository.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Table(name = "tbTarefa")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "TarefaId")
	private Long id=1L;

	@ManyToOne
	@JoinColumn(name = "FuncionarioId", nullable = false)
	private Funcionario funcionario;

	@Column(name = "Titulo", nullable = false, length = 100)
	private String titulo="Coletar cenouras";

	@Column(name = "Descricao", length = 255)
	private String descricao="Coletar cenouras";

	@Column(name = "DataLimite")
	private String dataLimite;

	@Column(name = "DataCriacao", nullable = false)
	private LocalDateTime dataCriacao = LocalDateTime.now();

	@Column(name = "DataConclusao")
	private LocalDateTime dataConclusao;

	@Column(name = "Status", nullable = false, length = 20)
	private String status = "Pendente";

	@Column(name = "Prioridade", nullable = false, length = 20)
	private String prioridade;

	// Getters e Setters
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public Funcionario getFuncionario() { return funcionario; }
	public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }

	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }

	public String getDataLimite() { return dataLimite; }
	public void setDataLimite(LocalDate dataLimite) { this.dataLimite = String.valueOf(dataLimite); }

	public LocalDateTime getDataCriacao() { return dataCriacao; }
	public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }

	public LocalDateTime getDataConclusao() { return dataConclusao; }
	public void setDataConclusao(LocalDateTime dataConclusao) { this.dataConclusao = dataConclusao; }

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }

	public String getPrioridade() { return prioridade; }
	public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

	public static class Builder {
		private Funcionario funcionario;
		private String titulo;
		private String descricao = ""; // Default vazio
		private String dataLimite;
		private LocalDateTime dataCriacao = LocalDateTime.now(); // Valor padrão
		private LocalDateTime dataConclusao;
		private String status = "Pendente"; // Valor padrão
		private String prioridade = "Normal"; // Valor padrão

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

		public Builder dataLimite(String dataLimite) {
			this.dataLimite = dataLimite;
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

		public Tarefa build() {
			Tarefa tarefa = new Tarefa();
			tarefa.funcionario = this.funcionario;
			tarefa.titulo = this.titulo;
			tarefa.descricao = this.descricao;
			tarefa.dataLimite = this.dataLimite;
			tarefa.dataCriacao = this.dataCriacao;
			tarefa.dataConclusao = this.dataConclusao;
			tarefa.status = this.status;
			tarefa.prioridade = this.prioridade;
			return tarefa;
		}
	}

	private Tarefa() {}
}
