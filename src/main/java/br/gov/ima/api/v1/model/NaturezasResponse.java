package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class NaturezasResponse  {
	
	
	private String ID = null;
	private String descricao = null;

	
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
	 * DescriÃ§Ã£o da natureza
	 **/
	@JsonProperty("descricao")
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class NaturezasResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
