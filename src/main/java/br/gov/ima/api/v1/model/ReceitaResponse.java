package br.gov.ima.api.v1.model;

import br.gov.ima.api.v1.model.LinksModel;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReceitaResponse  {
	
	
	private List<LinksModel> links = new ArrayList<LinksModel>() ;
	private String ID = null;
	private Integer anoMesEmissao = null;
	private String codigoOrigemRecurso = null;
	private String valorPrevisao = null;
	private String valorPrevisaoInicial = null;
	private String valorPrevisaoAdicional = null;
	private String valorPrevisaoDeducao = null;
	private String valorPrevisaoAnulacao = null;
	private String valorRealizado = null;
	private String valorRealizadoDeduzido = null;
	private String valorARealizar = null;
	private String valorARealizarDeduzido = null;
	private String valorPrevisaoAcrescimo = null;
	private String valorPrevisaoInicialAcrescimo = null;
	private String valorPrevisaoAdicionalAcrescimo = null;
	private String valorPrevisaoDeducaoAcrescimo = null;
	private String valorPrevisaoAnulacaoAcrescimo = null;
	private String valorRealizadoAcrescimo = null;
	private String valorRealizadoDeduzidoAcrescimo = null;
	private String valorARealizarAcrescimo = null;
	private String valorARealizarDeduzidoAcrescimo = null;

	
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
	 * Ano e MÃªs da EmissÃ£o de Receita
	 **/
	@JsonProperty("anoMesEmissao")
	public Integer getAnoMesEmissao() {
		return anoMesEmissao;
	}
	
	public void setAnoMesEmissao(Integer anoMesEmissao) {
		this.anoMesEmissao = anoMesEmissao;
	}
	
	/**
	 * CÃ³digo da Origem do Recurso
	 **/
	@JsonProperty("codigoOrigemRecurso")
	public String getCodigoOrigemRecurso() {
		return codigoOrigemRecurso;
	}
	
	public void setCodigoOrigemRecurso(String codigoOrigemRecurso) {
		this.codigoOrigemRecurso = codigoOrigemRecurso;
	}
	
	/**
	 * Valor Prevista da receita
	 **/
	@JsonProperty("valorPrevisao")
	public String getValorPrevisao() {
		return valorPrevisao;
	}
	
	public void setValorPrevisao(String valorPrevisao) {
		this.valorPrevisao = valorPrevisao;
	}
	
	/**
	 * Valor de previsÃ£o inicial da Receita
	 **/
	@JsonProperty("valorPrevisaoInicial")
	public String getValorPrevisaoInicial() {
		return valorPrevisaoInicial;
	}
	
	public void setValorPrevisaoInicial(String valorPrevisaoInicial) {
		this.valorPrevisaoInicial = valorPrevisaoInicial;
	}
	
	/**
	 * Valor de previsÃ£o adicicional da receita
	 **/
	@JsonProperty("valorPrevisaoAdicional")
	public String getValorPrevisaoAdicional() {
		return valorPrevisaoAdicional;
	}
	
	public void setValorPrevisaoAdicional(String valorPrevisaoAdicional) {
		this.valorPrevisaoAdicional = valorPrevisaoAdicional;
	}
	
	/**
	 * Valor de DeduÃ§Ã£o previsto da receita
	 **/
	@JsonProperty("valorPrevisaoDeducao")
	public String getValorPrevisaoDeducao() {
		return valorPrevisaoDeducao;
	}
	
	public void setValorPrevisaoDeducao(String valorPrevisaoDeducao) {
		this.valorPrevisaoDeducao = valorPrevisaoDeducao;
	}
	
	/**
	 * valor de AnulaÃ§Ã£o previsto da receita
	 **/
	@JsonProperty("valorPrevisaoAnulacao")
	public String getValorPrevisaoAnulacao() {
		return valorPrevisaoAnulacao;
	}
	
	public void setValorPrevisaoAnulacao(String valorPrevisaoAnulacao) {
		this.valorPrevisaoAnulacao = valorPrevisaoAnulacao;
	}
	
	/**
	 * Valor Realizado da receita
	 **/
	@JsonProperty("valorRealizado")
	public String getValorRealizado() {
		return valorRealizado;
	}
	
	public void setValorRealizado(String valorRealizado) {
		this.valorRealizado = valorRealizado;
	}
	
	/**
	 * Valor Realizado Deduzido da Receita
	 **/
	@JsonProperty("valorRealizadoDeduzido")
	public String getValorRealizadoDeduzido() {
		return valorRealizadoDeduzido;
	}
	
	public void setValorRealizadoDeduzido(String valorRealizadoDeduzido) {
		this.valorRealizadoDeduzido = valorRealizadoDeduzido;
	}
	
	/**
	 * Valor a Realizar da Receita
	 **/
	@JsonProperty("valorARealizar")
	public String getValorARealizar() {
		return valorARealizar;
	}
	
	public void setValorARealizar(String valorARealizar) {
		this.valorARealizar = valorARealizar;
	}
	
	/**
	 * Valor a Realizar deduzido da Receita
	 **/
	@JsonProperty("valorARealizarDeduzido")
	public String getValorARealizarDeduzido() {
		return valorARealizarDeduzido;
	}
	
	public void setValorARealizarDeduzido(String valorARealizarDeduzido) {
		this.valorARealizarDeduzido = valorARealizarDeduzido;
	}
	
	/**
	 * Valor de AcrÃ©scimo previsto da receita
	 **/
	@JsonProperty("valorPrevisaoAcrescimo")
	public String getValorPrevisaoAcrescimo() {
		return valorPrevisaoAcrescimo;
	}
	
	public void setValorPrevisaoAcrescimo(String valorPrevisaoAcrescimo) {
		this.valorPrevisaoAcrescimo = valorPrevisaoAcrescimo;
	}
	
	/**
	 * Valor de acrÃ©scimo previsto inicialmente da receita
	 **/
	@JsonProperty("valorPrevisaoInicialAcrescimo")
	public String getValorPrevisaoInicialAcrescimo() {
		return valorPrevisaoInicialAcrescimo;
	}
	
	public void setValorPrevisaoInicialAcrescimo(String valorPrevisaoInicialAcrescimo) {
		this.valorPrevisaoInicialAcrescimo = valorPrevisaoInicialAcrescimo;
	}
	
	/**
	 * Valor de AcrÃ©cimo Adicional previsto da receita
	 **/
	@JsonProperty("valorPrevisaoAdicionalAcrescimo")
	public String getValorPrevisaoAdicionalAcrescimo() {
		return valorPrevisaoAdicionalAcrescimo;
	}
	
	public void setValorPrevisaoAdicionalAcrescimo(String valorPrevisaoAdicionalAcrescimo) {
		this.valorPrevisaoAdicionalAcrescimo = valorPrevisaoAdicionalAcrescimo;
	}
	
	/**
	 * Valor de AcrÃ©scimo deduzido previsto da receita
	 **/
	@JsonProperty("valorPrevisaoDeducaoAcrescimo")
	public String getValorPrevisaoDeducaoAcrescimo() {
		return valorPrevisaoDeducaoAcrescimo;
	}
	
	public void setValorPrevisaoDeducaoAcrescimo(String valorPrevisaoDeducaoAcrescimo) {
		this.valorPrevisaoDeducaoAcrescimo = valorPrevisaoDeducaoAcrescimo;
	}
	
	/**
	 * Valor de Acrescimo anulado previsto da receita
	 **/
	@JsonProperty("valorPrevisaoAnulacaoAcrescimo")
	public String getValorPrevisaoAnulacaoAcrescimo() {
		return valorPrevisaoAnulacaoAcrescimo;
	}
	
	public void setValorPrevisaoAnulacaoAcrescimo(String valorPrevisaoAnulacaoAcrescimo) {
		this.valorPrevisaoAnulacaoAcrescimo = valorPrevisaoAnulacaoAcrescimo;
	}
	
	/**
	 * Valor de Acrescimo realizado da receita
	 **/
	@JsonProperty("valorRealizadoAcrescimo")
	public String getValorRealizadoAcrescimo() {
		return valorRealizadoAcrescimo;
	}
	
	public void setValorRealizadoAcrescimo(String valorRealizadoAcrescimo) {
		this.valorRealizadoAcrescimo = valorRealizadoAcrescimo;
	}
	
	/**
	 * Valor de Acrescimo deduzido realizado da receita
	 **/
	@JsonProperty("valorRealizadoDeduzidoAcrescimo")
	public String getValorRealizadoDeduzidoAcrescimo() {
		return valorRealizadoDeduzidoAcrescimo;
	}
	
	public void setValorRealizadoDeduzidoAcrescimo(String valorRealizadoDeduzidoAcrescimo) {
		this.valorRealizadoDeduzidoAcrescimo = valorRealizadoDeduzidoAcrescimo;
	}
	
	/**
	 * Valor de Acrescimo a realizar da receita
	 **/
	@JsonProperty("valorARealizarAcrescimo")
	public String getValorARealizarAcrescimo() {
		return valorARealizarAcrescimo;
	}
	
	public void setValorARealizarAcrescimo(String valorARealizarAcrescimo) {
		this.valorARealizarAcrescimo = valorARealizarAcrescimo;
	}
	
	/**
	 * Valor de Acrescimo deduzido a realizar da receita
	 **/
	@JsonProperty("valorARealizarDeduzidoAcrescimo")
	public String getValorARealizarDeduzidoAcrescimo() {
		return valorARealizarDeduzidoAcrescimo;
	}
	
	public void setValorARealizarDeduzidoAcrescimo(String valorARealizarDeduzidoAcrescimo) {
		this.valorARealizarDeduzidoAcrescimo = valorARealizarDeduzidoAcrescimo;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReceitaResponse {\n");
		
		sb.append("  links: ").append(links).append("\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  anoMesEmissao: ").append(anoMesEmissao).append("\n");
		sb.append("  codigoOrigemRecurso: ").append(codigoOrigemRecurso).append("\n");
		sb.append("  valorPrevisao: ").append(valorPrevisao).append("\n");
		sb.append("  valorPrevisaoInicial: ").append(valorPrevisaoInicial).append("\n");
		sb.append("  valorPrevisaoAdicional: ").append(valorPrevisaoAdicional).append("\n");
		sb.append("  valorPrevisaoDeducao: ").append(valorPrevisaoDeducao).append("\n");
		sb.append("  valorPrevisaoAnulacao: ").append(valorPrevisaoAnulacao).append("\n");
		sb.append("  valorRealizado: ").append(valorRealizado).append("\n");
		sb.append("  valorRealizadoDeduzido: ").append(valorRealizadoDeduzido).append("\n");
		sb.append("  valorARealizar: ").append(valorARealizar).append("\n");
		sb.append("  valorARealizarDeduzido: ").append(valorARealizarDeduzido).append("\n");
		sb.append("  valorPrevisaoAcrescimo: ").append(valorPrevisaoAcrescimo).append("\n");
		sb.append("  valorPrevisaoInicialAcrescimo: ").append(valorPrevisaoInicialAcrescimo).append("\n");
		sb.append("  valorPrevisaoAdicionalAcrescimo: ").append(valorPrevisaoAdicionalAcrescimo).append("\n");
		sb.append("  valorPrevisaoDeducaoAcrescimo: ").append(valorPrevisaoDeducaoAcrescimo).append("\n");
		sb.append("  valorPrevisaoAnulacaoAcrescimo: ").append(valorPrevisaoAnulacaoAcrescimo).append("\n");
		sb.append("  valorRealizadoAcrescimo: ").append(valorRealizadoAcrescimo).append("\n");
		sb.append("  valorRealizadoDeduzidoAcrescimo: ").append(valorRealizadoDeduzidoAcrescimo).append("\n");
		sb.append("  valorARealizarAcrescimo: ").append(valorARealizarAcrescimo).append("\n");
		sb.append("  valorARealizarDeduzidoAcrescimo: ").append(valorARealizarDeduzidoAcrescimo).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
