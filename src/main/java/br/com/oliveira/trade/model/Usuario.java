package br.com.oliveira.trade.model;

import java.time.LocalDate;

public class Usuario {
	private Long id;
	private String nome;
	private LocalDate dataDeNascimento;
	private String cpf;
	private String sexo;
	private String email;
	private String senha;
	private int numeroTelefone;

	public Usuario() {
	}

	public Usuario(String nome, LocalDate dataDeNascimento, String cpf, String sexo, String email, String senha,
			int numeroTelefone) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
		this.email = email;
		this.senha = senha;
		this.numeroTelefone = numeroTelefone;
	}

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + id + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", cpf=" + cpf
				+ ", sexo=" + sexo + ", email=" + email + ", senha=" + senha + ", numeroTelefone=" + numeroTelefone
				+ "]";
	}
}
