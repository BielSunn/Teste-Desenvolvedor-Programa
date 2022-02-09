package br.com.oliveira.trade.model;

public class Endereco {

	private long idEndereco;
	private Usuario idUsuario;
	private String estado;
	private String cidade;
	private String bairro;
	private int cep;
	private String logradouro;

	public Endereco() {
	}

	public Endereco(String estado, String cidade, String bairro, int cep, String logradouro) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.logradouro = logradouro;
	}

	public long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
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

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
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
		return "Endereco [estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", cep=" + cep
				+ ", logradouro=" + logradouro + "]";
	}

}