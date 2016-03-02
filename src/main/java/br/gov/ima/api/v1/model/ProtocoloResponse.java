package br.gov.ima.api.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ProtocoloResponse  {
	
	
	private String ID = null;
	private Integer codigoRegiao = null;
	private String nomeRegiao = null;
	private Long codigoBairro = null;
	private String nomeBairro = null;
	private Long codigoExpediente = null;
	private String secretariaExpediente = null;
	private Long codigoAssunto = null;
	private String descricaoAssunto = null;
	private Long anoProcesso = null;
	private Integer pontoCadastramento = null;
	private String nomePontoCadastramento = null;
	private Date dataCadastro = null;
	private Date dataAtendimento = null;
	private Date dataCancelamento = null;

	
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
	 * CÃ³digo da regiÃ£o onde foi registrado o protocolo.
	 **/
	@JsonProperty("codigoRegiao")
	public Integer getCodigoRegiao() {
		return codigoRegiao;
	}
	
	public void setCodigoRegiao(Integer codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}
	
	/**
	 * Nome da Ã¡rea onde a regiÃ£o se encontra. (Exemplo > \"NORTE\")
	 **/
	@JsonProperty("nomeRegiao")
	public String getNomeRegiao() {
		return nomeRegiao;
	}
	
	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}
	
	/**
	 * CÃ³digo de bairro referente ao protocolo.
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
	 * CÃ³digo do expediente emissor do protocolo.
	 **/
	@JsonProperty("codigoExpediente")
	public Long getCodigoExpediente() {
		return codigoExpediente;
	}
	
	public void setCodigoExpediente(Long codigoExpediente) {
		this.codigoExpediente = codigoExpediente;
	}
	
	/**
	 * DescriÃ§Ã£o da Secretaria expediente do protocolo.
	 **/
	@JsonProperty("secretariaExpediente")
	public String getSecretariaExpediente() {
		return secretariaExpediente;
	}
	
	public void setSecretariaExpediente(String secretariaExpediente) {
		this.secretariaExpediente = secretariaExpediente;
	}
	
	/**
	 * CÃ³digo do assunto referente ao protocolo.
	 **/
	@JsonProperty("codigoAssunto")
	public Long getCodigoAssunto() {
		return codigoAssunto;
	}
	
	public void setCodigoAssunto(Long codigoAssunto) {
		this.codigoAssunto = codigoAssunto;
	}
	
	/**
	 * DescriÃ§Ã£o do assunto do protocolo.
	 **/
	@JsonProperty("descricaoAssunto")
	public String getDescricaoAssunto() {
		return descricaoAssunto;
	}
	
	public void setDescricaoAssunto(String descricaoAssunto) {
		this.descricaoAssunto = descricaoAssunto;
	}
	
	/**
	 * Ano em que o processo foi iniciado.
	 **/
	@JsonProperty("anoProcesso")
	public Long getAnoProcesso() {
		return anoProcesso;
	}
	
	public void setAnoProcesso(Long anoProcesso) {
		this.anoProcesso = anoProcesso;
	}
	
	/**
	 * CÃ³digo do ponto onde o protocolo foi cadastrado.
	 **/
	@JsonProperty("pontoCadastramento")
	public Integer getPontoCadastramento() {
		return pontoCadastramento;
	}
	
	public void setPontoCadastramento(Integer pontoCadastramento) {
		this.pontoCadastramento = pontoCadastramento;
	}
	
	/**
	 * Nome do ponto de cadastramento.
	 **/
	@JsonProperty("nomePontoCadastramento")
	public String getNomePontoCadastramento() {
		return nomePontoCadastramento;
	}
	
	public void setNomePontoCadastramento(String nomePontoCadastramento) {
		this.nomePontoCadastramento = nomePontoCadastramento;
	}
	
	/**
	 * Data do cadastro do protocolo.
	 **/
	@JsonProperty("dataCadastro")
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	/**
	 * Data do atendimento.
	 **/
	@JsonProperty("dataAtendimento")
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	
	/**
	 * Data em que o protocolo foi cancelado.
	 **/
	@JsonProperty("dataCancelamento")
	public Date getDataCancelamento() {
		return dataCancelamento;
	}
	
	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProtocoloResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  codigoRegiao: ").append(codigoRegiao).append("\n");
		sb.append("  nomeRegiao: ").append(nomeRegiao).append("\n");
		sb.append("  codigoBairro: ").append(codigoBairro).append("\n");
		sb.append("  nomeBairro: ").append(nomeBairro).append("\n");
		sb.append("  codigoExpediente: ").append(codigoExpediente).append("\n");
		sb.append("  secretariaExpediente: ").append(secretariaExpediente).append("\n");
		sb.append("  codigoAssunto: ").append(codigoAssunto).append("\n");
		sb.append("  descricaoAssunto: ").append(descricaoAssunto).append("\n");
		sb.append("  anoProcesso: ").append(anoProcesso).append("\n");
		sb.append("  pontoCadastramento: ").append(pontoCadastramento).append("\n");
		sb.append("  nomePontoCadastramento: ").append(nomePontoCadastramento).append("\n");
		sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
		sb.append("  dataAtendimento: ").append(dataAtendimento).append("\n");
		sb.append("  dataCancelamento: ").append(dataCancelamento).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
