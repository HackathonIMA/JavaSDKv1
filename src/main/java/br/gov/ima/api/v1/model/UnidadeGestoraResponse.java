package br.gov.ima.api.v1.model;

import br.gov.ima.api.v1.model.LinksModel;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UnidadeGestoraResponse  {
	
	
	private List<LinksModel> links = new ArrayList<LinksModel>() ;
	private String ID = null;
	private String descricao = null;
	private String gestao = null;

	
	/**
	 **/
	@JsonProperty("links")
	public List<LinksModel> getLinks() {
		return links;
	}
	
	public void setLinks(List<LinksModel> links) {
		this.links = links;
	}
	
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
	 * DescriÃ§Ã£o da Unidade Gestora
	 **/
	@JsonProperty("descricao")
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * DescriÃ§Ã£o do tipo de gestÃ£o  ou CÃ³digo do tipo de GestÃ£o
	 **/
	@JsonProperty("gestao")
	public String getGestao() {
		return gestao;
	}
	
	public void setGestao(String gestao) {
		this.gestao = gestao;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class UnidadeGestoraResponse {\n");
		
		sb.append("  links: ").append(links).append("\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("  gestao: ").append(gestao).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
