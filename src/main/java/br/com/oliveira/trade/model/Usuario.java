package br.com.oliveira.trade.model;

public class Usuario {
	private Long idUsuario;
	private String nome;
	private String dataDeNascimento;
	private String cpf;
	private String sexo;
	private String email;
	private String senha;
	private int numeroTelefone;

	public Usuario() {
	}

	public Usuario(String nome, String dataDeNascimento, String cpf, String sexo, String email, String senha,
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento
				+ ", cpf=" + cpf + ", sexo=" + sexo + ", email=" + email + ", senha=" + senha + ", numeroTelefone="
				+ numeroTelefone + "]";
	}
}
