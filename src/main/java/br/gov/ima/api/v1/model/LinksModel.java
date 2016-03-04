package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class LinksModel  {
	
	
	private String rel = null;
	private String href = null;

	
	/**
	 * TODO
	 **/
	@JsonProperty("rel")
	public String getRel() {
		return rel;
	}
	
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	/**
	 * TODO
	 **/
	@JsonProperty("href")
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksModel {\n");
		
		sb.append("  rel: ").append(rel).append("\n");
		sb.append("  href: ").append(href).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
