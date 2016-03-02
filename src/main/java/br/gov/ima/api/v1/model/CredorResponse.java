package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CredorResponse  {
	
	
	private String ID = null;
	private String descricao = null;
	private String municipioDescricao = null;

	
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
	 * Descricao do credor
	 **/
	@JsonProperty("descricao")
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Municipio do credor
	 **/
	@JsonProperty("municipioDescricao")
	public String getMunicipioDescricao() {
		return municipioDescricao;
	}
	
	public void setMunicipioDescricao(String municipioDescricao) {
		this.municipioDescricao = municipioDescricao;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class CredorResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("  municipioDescricao: ").append(municipioDescricao).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
