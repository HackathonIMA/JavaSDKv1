package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class FonteDetalhadaResponse  {
	
	
	private String ID = null;
	private String descricao = null;
	private String codigoGrupo = null;

	
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
	 * DescriÃ§Ã£o da fonte receita
	 **/
	@JsonProperty("descricao")
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * cÃ³digo grupo fonte receita
	 **/
	@JsonProperty("codigoGrupo")
	public String getCodigoGrupo() {
		return codigoGrupo;
	}
	
	public void setCodigoGrupo(String codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class FonteDetalhadaResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("  codigoGrupo: ").append(codigoGrupo).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
