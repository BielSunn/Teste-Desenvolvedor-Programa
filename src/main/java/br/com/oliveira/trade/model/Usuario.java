package br.com.oliveira.trade.model;

import java.time.LocalDate;

/**
 * Classe Modelo de usuário
 * 
 * @author Gabriel Sun
 *
 */

public class Usuario {
	private int id;
	private String nome;
	private LocalDate dataDeNascimento;
	private String cpf;
	private String sexo;
	private String email;
	private String senha;
	private int numeroTelefone;
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String logradouro;

	public Usuario() {
	}

	/**
	 * Construtor utilizado para realizar o cadastro do usuário
	 * 
	 * @param nome             -> nome do usuário
	 * @param dataDeNascimento -> data de nascimento
	 * @param cpf              -> cpf
	 * @param sexo             -> sexo (Masculino ou Feminino)
	 * @param email            -> email
	 * @param senha            -> senha
	 * @param numeroTelefone   -> número de telefone
	 * @param estado           -> Estado
	 * @param cidade           -> Cidade
	 * @param bairro           -> Bairro
	 * @param cep              -> Cep
	 * @param logradouro       -> Logradouro
	 */

	public Usuario(String nome, LocalDate dataDeNascimento, String cpf, String sexo, String email, String senha,
			int numeroTelefone, String estado, String cidade, String bairro, String cep, String logradouro) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
		this.email = email;
		this.senha = senha;
		this.numeroTelefone = numeroTelefone;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.logradouro = logradouro;
	}

	/**
	 * Construtor utilizado para verificação do login no sistema com o email e
	 * senha.
	 * 
	 * @param email -> utilizado no cadastro do usuário
	 * @param senha -> utilizado no cadastro do usuário
	 */

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", cpf=" + cpf
				+ ", sexo=" + sexo + ", email=" + email + ", senha=" + senha + ", numeroTelefone=" + numeroTelefone
				+ ", estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", cep=" + cep + ", logradouro="
				+ logradouro + "]";
	}

}
