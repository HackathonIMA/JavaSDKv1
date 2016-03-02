package br.gov.ima.api.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SaudeResponse  {
	
	
	private String ID = null;
	private String distritoVinculo = null;
	private String municipio = null;
	private String uf = null;
	private String localAtendimento = null;
	private String distritoAtendimento = null;
	private Date dataAtendimento = null;
	private Long codigoTipoAtendimento = null;
	private String descricaoTipoAtendimento = null;
	private String descricaoGrupoAtendimento = null;
	private Integer codigoGrupoAtendimentoSUS = null;
	private String ocupacaoProfissional = null;
	private String descricaoTipoVinculoSMS = null;
	private Long codigoProcedimentoSUS = null;
	private String descricaoProcedimento = null;
	private Integer codigoAtividadeProfissionalSUS = null;
	private String descricaoAtividadeProfissional = null;
	private String sexo = null;
	private String idade = null;
	private String hora = null;
	private String periodo = null;
	private Date dataNascimento = null;
	private Integer quantidadeRealizada = null;

	
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
	 * Distrito onde o antendimento foi realizado.
	 **/
	@JsonProperty("distritoVinculo")
	public String getDistritoVinculo() {
		return distritoVinculo;
	}
	
	public void setDistritoVinculo(String distritoVinculo) {
		this.distritoVinculo = distritoVinculo;
	}
	
	/**
	 * Nome do municÃ­pio
	 **/
	@JsonProperty("municipio")
	public String getMunicipio() {
		return municipio;
	}
	
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	/**
	 * IndicaÃ§Ã£o da unidade federal.
	 **/
	@JsonProperty("uf")
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	/**
	 * Nome do local onde o atendimento foi feito.
	 **/
	@JsonProperty("localAtendimento")
	public String getLocalAtendimento() {
		return localAtendimento;
	}
	
	public void setLocalAtendimento(String localAtendimento) {
		this.localAtendimento = localAtendimento;
	}
	
	/**
	 * Indicacao do distrito onde o atendimento ocorreu.
	 **/
	@JsonProperty("distritoAtendimento")
	public String getDistritoAtendimento() {
		return distritoAtendimento;
	}
	
	public void setDistritoAtendimento(String distritoAtendimento) {
		this.distritoAtendimento = distritoAtendimento;
	}
	
	/**
	 * Data e hora que o atendimento ocorreu.
	 **/
	@JsonProperty("dataAtendimento")
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	
	/**
	 * CÃ³digo do tipo de atendimento.
	 **/
	@JsonProperty("codigoTipoAtendimento")
	public Long getCodigoTipoAtendimento() {
		return codigoTipoAtendimento;
	}
	
	public void setCodigoTipoAtendimento(Long codigoTipoAtendimento) {
		this.codigoTipoAtendimento = codigoTipoAtendimento;
	}
	
	/**
	 * Descricao do tipo de atendimento.
	 **/
	@JsonProperty("descricaoTipoAtendimento")
	public String getDescricaoTipoAtendimento() {
		return descricaoTipoAtendimento;
	}
	
	public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
		this.descricaoTipoAtendimento = descricaoTipoAtendimento;
	}
	
	/**
	 * DescriÃ§Ã£o do grupo de atendimento.
	 **/
	@JsonProperty("descricaoGrupoAtendimento")
	public String getDescricaoGrupoAtendimento() {
		return descricaoGrupoAtendimento;
	}
	
	public void setDescricaoGrupoAtendimento(String descricaoGrupoAtendimento) {
		this.descricaoGrupoAtendimento = descricaoGrupoAtendimento;
	}
	
	/**
	 * CÃ³digo do grupo de atendimento vinculado ao SUS.
	 **/
	@JsonProperty("codigoGrupoAtendimentoSUS")
	public Integer getCodigoGrupoAtendimentoSUS() {
		return codigoGrupoAtendimentoSUS;
	}
	
	public void setCodigoGrupoAtendimentoSUS(Integer codigoGrupoAtendimentoSUS) {
		this.codigoGrupoAtendimentoSUS = codigoGrupoAtendimentoSUS;
	}
	
	/**
	 * Descricao formal da ocupaÃ§Ã£o do profissional.
	 **/
	@JsonProperty("ocupacaoProfissional")
	public String getOcupacaoProfissional() {
		return ocupacaoProfissional;
	}
	
	public void setOcupacaoProfissional(String ocupacaoProfissional) {
		this.ocupacaoProfissional = ocupacaoProfissional;
	}
	
	/**
	 * DescriÃ§Ã£o do tipo de vinculo com a Secretaria Municipal de SaÃºde.
	 **/
	@JsonProperty("descricaoTipoVinculoSMS")
	public String getDescricaoTipoVinculoSMS() {
		return descricaoTipoVinculoSMS;
	}
	
	public void setDescricaoTipoVinculoSMS(String descricaoTipoVinculoSMS) {
		this.descricaoTipoVinculoSMS = descricaoTipoVinculoSMS;
	}
	
	/**
	 * CÃ³digo do procedimento realizado pelo SUS
	 **/
	@JsonProperty("codigoProcedimentoSUS")
	public Long getCodigoProcedimentoSUS() {
		return codigoProcedimentoSUS;
	}
	
	public void setCodigoProcedimentoSUS(Long codigoProcedimentoSUS) {
		this.codigoProcedimentoSUS = codigoProcedimentoSUS;
	}
	
	/**
	 * Descricao do procedimento.
	 **/
	@JsonProperty("descricaoProcedimento")
	public String getDescricaoProcedimento() {
		return descricaoProcedimento;
	}
	
	public void setDescricaoProcedimento(String descricaoProcedimento) {
		this.descricaoProcedimento = descricaoProcedimento;
	}
	
	/**
	 * CÃ³digo do profissional SUS.
	 **/
	@JsonProperty("codigoAtividadeProfissionalSUS")
	public Integer getCodigoAtividadeProfissionalSUS() {
		return codigoAtividadeProfissionalSUS;
	}
	
	public void setCodigoAtividadeProfissionalSUS(Integer codigoAtividadeProfissionalSUS) {
		this.codigoAtividadeProfissionalSUS = codigoAtividadeProfissionalSUS;
	}
	
	/**
	 * IndicaÃ§Ã£o da profissÃ£o do atendente.
	 **/
	@JsonProperty("descricaoAtividadeProfissional")
	public String getDescricaoAtividadeProfissional() {
		return descricaoAtividadeProfissional;
	}
	
	public void setDescricaoAtividadeProfissional(String descricaoAtividadeProfissional) {
		this.descricaoAtividadeProfissional = descricaoAtividadeProfissional;
	}
	
	/**
	 * DescriÃ§Ã£o do sexo. ('MASCULINO' ou 'FEMININO')
	 **/
	@JsonProperty("sexo")
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * IndicaÃ§Ã£o da idade.
	 **/
	@JsonProperty("idade")
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	/**
	 * IndicaÃ§Ã£o da hora da ocorrÃªncia.
	 **/
	@JsonProperty("hora")
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	/**
	 * Descricao do periodo (Exemplo > MANHA)
	 **/
	@JsonProperty("periodo")
	public String getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	/**
	 * Data de nascimento do profissional.
	 **/
	@JsonProperty("dataNascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	/**
	 * Quantidade de atendimento realizados.
	 **/
	@JsonProperty("quantidadeRealizada")
	public Integer getQuantidadeRealizada() {
		return quantidadeRealizada;
	}
	
	public void setQuantidadeRealizada(Integer quantidadeRealizada) {
		this.quantidadeRealizada = quantidadeRealizada;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class SaudeResponse {\n");
		
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  distritoVinculo: ").append(distritoVinculo).append("\n");
		sb.append("  municipio: ").append(municipio).append("\n");
		sb.append("  uf: ").append(uf).append("\n");
		sb.append("  localAtendimento: ").append(localAtendimento).append("\n");
		sb.append("  distritoAtendimento: ").append(distritoAtendimento).append("\n");
		sb.append("  dataAtendimento: ").append(dataAtendimento).append("\n");
		sb.append("  codigoTipoAtendimento: ").append(codigoTipoAtendimento).append("\n");
		sb.append("  descricaoTipoAtendimento: ").append(descricaoTipoAtendimento).append("\n");
		sb.append("  descricaoGrupoAtendimento: ").append(descricaoGrupoAtendimento).append("\n");
		sb.append("  codigoGrupoAtendimentoSUS: ").append(codigoGrupoAtendimentoSUS).append("\n");
		sb.append("  ocupacaoProfissional: ").append(ocupacaoProfissional).append("\n");
		sb.append("  descricaoTipoVinculoSMS: ").append(descricaoTipoVinculoSMS).append("\n");
		sb.append("  codigoProcedimentoSUS: ").append(codigoProcedimentoSUS).append("\n");
		sb.append("  descricaoProcedimento: ").append(descricaoProcedimento).append("\n");
		sb.append("  codigoAtividadeProfissionalSUS: ").append(codigoAtividadeProfissionalSUS).append("\n");
		sb.append("  descricaoAtividadeProfissional: ").append(descricaoAtividadeProfissional).append("\n");
		sb.append("  sexo: ").append(sexo).append("\n");
		sb.append("  idade: ").append(idade).append("\n");
		sb.append("  hora: ").append(hora).append("\n");
		sb.append("  periodo: ").append(periodo).append("\n");
		sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
		sb.append("  quantidadeRealizada: ").append(quantidadeRealizada).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
