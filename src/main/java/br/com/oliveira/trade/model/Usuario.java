package br.com.oliveira.trade.model;

public class Usuario {
	private long idUsuario;
	private String nome;
	private String dataDeNascimento;
	private String cpf;
//	private String sexo;
	private String email;
	private String senha;

	public Usuario(String nome, String dataDeNascimento, String cpf, String email, String senha) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

//	public String getSexo() {
//		return sexo;
//	}
//
//	public void setSexo(String sexo) {
//		this.sexo = sexo;
//	}

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

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", cpf=" + cpf + ", email=" + email
				+ ", senha=" + senha + "]";
	}
	
	

}
