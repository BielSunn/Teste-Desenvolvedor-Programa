package br.com.oliveira.trade.model;

public class Usuario {
	private long idUsuario;
	private String nome;
	private String dataDeNascimento;
	private String cpf;
	private String email;
	private String senha;
	private String numeroTelefone;
	private String sexo;

	public Usuario(String nome, String dataDeNascimento, String cpf, String email, String senha, String numeroTelefone,
			String sexo) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.numeroTelefone = numeroTelefone;
		this.sexo = sexo;
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

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", cpf=" + cpf + ", email=" + email
				+ ", senha=" + senha + ", numeroTelefone=" + numeroTelefone + ", sexo=" + sexo + "]";
	}

}
