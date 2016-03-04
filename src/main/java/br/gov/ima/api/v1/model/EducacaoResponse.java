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
	private String enderecoEscolaDemanda = null;
	private String logradouroDemanda = null;
	private String municipioDemanda = null;
	private String ufDemanda = null;
	private String cepDemanda = null;
	private String demanda = null;

	
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
	 * CÃ³digo do grupo escolar (AG1: 0~1,5 anos, AG2: 1,5~3 anos, AG3: 3 ~5 anos).
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
	
	/**
	 * EndereÃ§o completo da unidade onde foi registrada a demanda.
	 **/
	@JsonProperty("endereco_escola_demanda")
	public String getEnderecoEscolaDemanda() {
		return enderecoEscolaDemanda;
	}
	
	public void setEnderecoEscolaDemanda(String enderecoEscolaDemanda) {
		this.enderecoEscolaDemanda = enderecoEscolaDemanda;
	}
	
	/**
	 * Nome do logradouro da unidade onde foi registrada a demanda.
	 **/
	@JsonProperty("logradouro_demanda")
	public String getLogradouroDemanda() {
		return logradouroDemanda;
	}
	
	public void setLogradouroDemanda(String logradouroDemanda) {
		this.logradouroDemanda = logradouroDemanda;
	}
	
	/**
	 * Nome do municÃ­pio da unidade onde foi registrada a demanda. (sempre Campinas)
	 **/
	@JsonProperty("municipio_demanda")
	public String getMunicipioDemanda() {
		return municipioDemanda;
	}
	
	public void setMunicipioDemanda(String municipioDemanda) {
		this.municipioDemanda = municipioDemanda;
	}
	
	/**
	 * Sigla da unidade federativa do cadastro da demanda (sempre SP)
	 **/
	@JsonProperty("uf_demanda")
	public String getUfDemanda() {
		return ufDemanda;
	}
	
	public void setUfDemanda(String ufDemanda) {
		this.ufDemanda = ufDemanda;
	}
	
	/**
	 * CEP registrado do endereÃ§o da unidade onde foi registrada a demanda.
	 **/
	@JsonProperty("cep_demanda")
	public String getCepDemanda() {
		return cepDemanda;
	}
	
	public void setCepDemanda(String cepDemanda) {
		this.cepDemanda = cepDemanda;
	}
	
	/**
	 * Quantidade total do registro da demanda. Cada registro do webservice traz a tipificaÃ§Ã£o da demanda e este campo mostra os valores consolidados totais para a demanda.
	 **/
	@JsonProperty("demanda")
	public String getDemanda() {
		return demanda;
	}
	
	public void setDemanda(String demanda) {
		this.demanda = demanda;
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
		sb.append("  enderecoEscolaDemanda: ").append(enderecoEscolaDemanda).append("\n");
		sb.append("  logradouroDemanda: ").append(logradouroDemanda).append("\n");
		sb.append("  municipioDemanda: ").append(municipioDemanda).append("\n");
		sb.append("  ufDemanda: ").append(ufDemanda).append("\n");
		sb.append("  cepDemanda: ").append(cepDemanda).append("\n");
		sb.append("  demanda: ").append(demanda).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
