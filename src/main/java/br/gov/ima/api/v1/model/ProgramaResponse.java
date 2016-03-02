package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ProgramaResponse  {
	
	
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
	 * Descricao do Programa
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
		sb.append("class ProgramaResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
