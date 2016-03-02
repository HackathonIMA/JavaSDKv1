package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class EmpenhoResponse  {
	
	
	private String ID = null;
	private Integer codigoFuncao = null;
	private String processo = null;

	
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
	 * CÃ³digo da funcao
	 **/
	@JsonProperty("codigoFuncao")
	public Integer getCodigoFuncao() {
		return codigoFuncao;
	}
	
	public void setCodigoFuncao(Integer codigoFuncao) {
		this.codigoFuncao = codigoFuncao;
	}
	
	/**
	 * Procesos de compra
	 **/
	@JsonProperty("processo")
	public String getProcesso() {
		return processo;
	}
	
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmpenhoResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  codigoFuncao: ").append(codigoFuncao).append("\n");
		sb.append("  processo: ").append(processo).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
