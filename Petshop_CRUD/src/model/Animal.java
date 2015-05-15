package model;

public class Animal {
	private Integer numeroDaEtiqueta;
	private String nome;
	private String raca;
	private String peso;
	private String idade_estimada;
	private String cor;
	// Select
	private String porte;
	// TextArea
	private String descricao;

	public Animal(Integer numeroDaEtiqueta, String nome, String raca,
			String peso, String idade_estimada, String cor, String porte,
			String descricao) {
		this.numeroDaEtiqueta = numeroDaEtiqueta;
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.idade_estimada = idade_estimada;
		this.cor = cor;
		this.porte = porte;
		this.descricao = descricao;
	}

	public Integer getNumeroDaEtiqueta() {
		return numeroDaEtiqueta;
	}

	public void setNumeroDaEtiqueta(Integer numeroDaEtiqueta) {
		this.numeroDaEtiqueta = numeroDaEtiqueta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getIdade_estimada() {
		return idade_estimada;
	}

	public void setIdade_estimada(String idade_estimada) {
		this.idade_estimada = idade_estimada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
