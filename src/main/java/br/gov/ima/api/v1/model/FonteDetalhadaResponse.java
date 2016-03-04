package br.gov.ima.api.v1.model;

import br.gov.ima.api.v1.model.LinksModel;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FonteDetalhadaResponse  {
	
	
	private List<LinksModel> links = new ArrayList<LinksModel>() ;
	private String ID = null;
	private String descricao = null;
	private String codigoGrupo = null;

	
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
		
		sb.append("  links: ").append(links).append("\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("  codigoGrupo: ").append(codigoGrupo).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
