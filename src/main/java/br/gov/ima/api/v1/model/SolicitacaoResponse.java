package br.gov.ima.api.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SolicitacaoResponse  {
	
	
	private String ID = null;
	private String nomeRegional = null;
	private String codigoRegiao = null;
	private String nomeRegiao = null;
	private String secretaria = null;
	private Long codigoBairro = null;
	private String nomeBairro = null;
	private Integer codigoAssunto = null;
	private String descricaoAssunto = null;
	private Integer anoSolicitacao = null;
	private Integer tipoSolicitacao = null;
	private String descricaoTipoSolicitacao = null;
	private Integer statusSolicitacao = null;
	private String descricaoStatus = null;
	private Date dataCadastro = null;
	private Date dataPrevisaoResposta = null;
	private Date dataAtendimento = null;
	private Date dataConclusao = null;
	private String cep = null;
	private String tipoLogradouro = null;
	private String nomeLogradouro = null;
	private Date dataProvidencia = null;

	
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
	 * Nome da administraÃ§Ã£o regional.
	 **/
	@JsonProperty("nomeRegional")
	public String getNomeRegional() {
		return nomeRegional;
	}
	
	public void setNomeRegional(String nomeRegional) {
		this.nomeRegional = nomeRegional;
	}
	
	/**
	 * CÃ³digo da regiÃ£o.
	 **/
	@JsonProperty("codigoRegiao")
	public String getCodigoRegiao() {
		return codigoRegiao;
	}
	
	public void setCodigoRegiao(String codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}
	
	/**
	 * Nome / DescriÃ§Ã£o da regiÃ£o.
	 **/
	@JsonProperty("nomeRegiao")
	public String getNomeRegiao() {
		return nomeRegiao;
	}
	
	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}
	
	/**
	 * Nome da secretÃ¡ria.
	 **/
	@JsonProperty("secretaria")
	public String getSecretaria() {
		return secretaria;
	}
	
	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	
	/**
	 * CÃ³digo da bairro.
	 **/
	@JsonProperty("codigoBairro")
	public Long getCodigoBairro() {
		return codigoBairro;
	}
	
	public void setCodigoBairro(Long codigoBairro) {
		this.codigoBairro = codigoBairro;
	}
	
	/**
	 * Nome do bairro.
	 **/
	@JsonProperty("nomeBairro")
	public String getNomeBairro() {
		return nomeBairro;
	}
	
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	
	/**
	 * CÃ³digo do assunto da solicitaÃ§Ã£o.
	 **/
	@JsonProperty("codigoAssunto")
	public Integer getCodigoAssunto() {
		return codigoAssunto;
	}
	
	public void setCodigoAssunto(Integer codigoAssunto) {
		this.codigoAssunto = codigoAssunto;
	}
	
	/**
	 * DescriÃ§Ã£o do assunto da solicitaÃ§Ã£o.
	 **/
	@JsonProperty("descricaoAssunto")
	public String getDescricaoAssunto() {
		return descricaoAssunto;
	}
	
	public void setDescricaoAssunto(String descricaoAssunto) {
		this.descricaoAssunto = descricaoAssunto;
	}
	
	/**
	 * Ano em que a solicitaÃ§Ã£o ocorreu.
	 **/
	@JsonProperty("anoSolicitacao")
	public Integer getAnoSolicitacao() {
		return anoSolicitacao;
	}
	
	public void setAnoSolicitacao(Integer anoSolicitacao) {
		this.anoSolicitacao = anoSolicitacao;
	}
	
	/**
	 * CÃ³digo referente ao tipo de solicitaÃ§Ã£o.
	 **/
	@JsonProperty("tipoSolicitacao")
	public Integer getTipoSolicitacao() {
		return tipoSolicitacao;
	}
	
	public void setTipoSolicitacao(Integer tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}
	
	/**
	 * DescriÃ§Ã£o do tipo de solicitaÃ§Ã£o realizada.
	 **/
	@JsonProperty("descricaoTipoSolicitacao")
	public String getDescricaoTipoSolicitacao() {
		return descricaoTipoSolicitacao;
	}
	
	public void setDescricaoTipoSolicitacao(String descricaoTipoSolicitacao) {
		this.descricaoTipoSolicitacao = descricaoTipoSolicitacao;
	}
	
	/**
	 * CÃ³digo do status da solicitaÃ§Ã£o.
	 **/
	@JsonProperty("statusSolicitacao")
	public Integer getStatusSolicitacao() {
		return statusSolicitacao;
	}
	
	public void setStatusSolicitacao(Integer statusSolicitacao) {
		this.statusSolicitacao = statusSolicitacao;
	}
	
	/**
	 * DescriÃ§Ã£o do status.
	 **/
	@JsonProperty("descricaoStatus")
	public String getDescricaoStatus() {
		return descricaoStatus;
	}
	
	public void setDescricaoStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}
	
	/**
	 * Data do cadastramento da solicitaÃ§Ã£o.
	 **/
	@JsonProperty("dataCadastro")
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	/**
	 * Data da previsÃ£o de resposta da solicitaÃ§Ã£o depois de executada.
	 **/
	@JsonProperty("dataPrevisaoResposta")
	public Date getDataPrevisaoResposta() {
		return dataPrevisaoResposta;
	}
	
	public void setDataPrevisaoResposta(Date dataPrevisaoResposta) {
		this.dataPrevisaoResposta = dataPrevisaoResposta;
	}
	
	/**
	 * Data em que o atendimento ocorreu
	 **/
	@JsonProperty("dataAtendimento")
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	
	/**
	 * Data em que a solicitaÃ§Ã£o foi concluÃ­da.
	 **/
	@JsonProperty("dataConclusao")
	public Date getDataConclusao() {
		return dataConclusao;
	}
	
	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	
	/**
	 * CEP
	 **/
	@JsonProperty("cep")
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	/**
	 * Tipo de logradouro (Exemplo > Rua, Avenida, etc.)
	 **/
	@JsonProperty("tipoLogradouro")
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	/**
	 * Nome da rua / logradouro.
	 **/
	@JsonProperty("nomeLogradouro")
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	
	/**
	 * Data da providÃªncia
	 **/
	@JsonProperty("dataProvidencia")
	public Date getDataProvidencia() {
		return dataProvidencia;
	}
	
	public void setDataProvidencia(Date dataProvidencia) {
		this.dataProvidencia = dataProvidencia;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class SolicitacaoResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  nomeRegional: ").append(nomeRegional).append("\n");
		sb.append("  codigoRegiao: ").append(codigoRegiao).append("\n");
		sb.append("  nomeRegiao: ").append(nomeRegiao).append("\n");
		sb.append("  secretaria: ").append(secretaria).append("\n");
		sb.append("  codigoBairro: ").append(codigoBairro).append("\n");
		sb.append("  nomeBairro: ").append(nomeBairro).append("\n");
		sb.append("  codigoAssunto: ").append(codigoAssunto).append("\n");
		sb.append("  descricaoAssunto: ").append(descricaoAssunto).append("\n");
		sb.append("  anoSolicitacao: ").append(anoSolicitacao).append("\n");
		sb.append("  tipoSolicitacao: ").append(tipoSolicitacao).append("\n");
		sb.append("  descricaoTipoSolicitacao: ").append(descricaoTipoSolicitacao).append("\n");
		sb.append("  statusSolicitacao: ").append(statusSolicitacao).append("\n");
		sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
		sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
		sb.append("  dataPrevisaoResposta: ").append(dataPrevisaoResposta).append("\n");
		sb.append("  dataAtendimento: ").append(dataAtendimento).append("\n");
		sb.append("  dataConclusao: ").append(dataConclusao).append("\n");
		sb.append("  cep: ").append(cep).append("\n");
		sb.append("  tipoLogradouro: ").append(tipoLogradouro).append("\n");
		sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
		sb.append("  dataProvidencia: ").append(dataProvidencia).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
