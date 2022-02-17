package br.com.oliveira.trade.model;

public class Endereco {

	private long idEndereco;
	private Usuario usuario;
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String logradouro;

	public Endereco() {
	}

	public Endereco(String estado, String cidade, String bairro, String cep, String logradouro) {
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		return "Endereco [estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", cep=" + cep
				+ ", logradouro=" + logradouro + "]";
	}

}
