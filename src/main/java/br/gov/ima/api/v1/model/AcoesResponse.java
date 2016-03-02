package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class AcoesResponse  {
	
	
	private String ID = null;
	private String nome = null;
	private Integer descricao = null;
	private String numero = null;

	
	/**
	 * Identificador do registro.
	 **/
	@JsonProperty("ID")
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	/**
	 * Nome da aÃ§Ã£o
	 **/
	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * DescriÃ§Ã£o da aÃ§Ã£o
	 **/
	@JsonProperty("descricao")
	public Integer getDescricao() {
		return descricao;
	}
	
	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Numero da aÃ§Ã£o
	 **/
	@JsonProperty("numero")
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class AcoesResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  nome: ").append(nome).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("  numero: ").append(numero).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
