package br.gov.ima.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class EducacaoResponse  {
	
	
	private String ID = null;
	private Long ano = null;
	private Integer codigoRegiao = null;
	private String descricaoRegiao = null;
	private String escalaGrupo = null;
	private String regime = null;
	private String nomeUnidadeEscolar = null;
	private String bairro = null;
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
	 * Ano do registro.
	 **/
	@JsonProperty("ano")
	public Long getAno() {
		return ano;
	}
	
	public void setAno(Long ano) {
		this.ano = ano;
	}
	
	/**
	 * CÃ³digo da regiÃ£o.
	 **/
	@JsonProperty("codigoRegiao")
	public Integer getCodigoRegiao() {
		return codigoRegiao;
	}
	
	public void setCodigoRegiao(Integer codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}
	
	/**
	 * DescriÃ§Ã£o da regiÃ£o.
	 **/
	@JsonProperty("descricaoRegiao")
	public String getDescricaoRegiao() {
		return descricaoRegiao;
	}
	
	public void setDescricaoRegiao(String descricaoRegiao) {
		this.descricaoRegiao = descricaoRegiao;
	}
	
	/**
	 * CÃ³digo do grupo escolar.
	 **/
	@JsonProperty("escalaGrupo")
	public String getEscalaGrupo() {
		return escalaGrupo;
	}
	
	public void setEscalaGrupo(String escalaGrupo) {
		this.escalaGrupo = escalaGrupo;
	}
	
	/**
	 * DescriÃ§Ã£o do regime escolar.
	 **/
	@JsonProperty("regime")
	public String getRegime() {
		return regime;
	}
	
	public void setRegime(String regime) {
		this.regime = regime;
	}
	
	/**
	 * Nome da Unidade escolar.
	 **/
	@JsonProperty("nomeUnidadeEscolar")
	public String getNomeUnidadeEscolar() {
		return nomeUnidadeEscolar;
	}
	
	public void setNomeUnidadeEscolar(String nomeUnidadeEscolar) {
		this.nomeUnidadeEscolar = nomeUnidadeEscolar;
	}
	
	/**
	 * Nome do bairro onde a unidade escolar se encontra.
	 **/
	@JsonProperty("bairro")
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	/**
	 * DescriÃ§Ã£o da demanda.
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
		sb.append("class EducacaoResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  ano: ").append(ano).append("\n");
		sb.append("  codigoRegiao: ").append(codigoRegiao).append("\n");
		sb.append("  descricaoRegiao: ").append(descricaoRegiao).append("\n");
		sb.append("  escalaGrupo: ").append(escalaGrupo).append("\n");
		sb.append("  regime: ").append(regime).append("\n");
		sb.append("  nomeUnidadeEscolar: ").append(nomeUnidadeEscolar).append("\n");
		sb.append("  bairro: ").append(bairro).append("\n");
		sb.append("  descricao: ").append(descricao).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
