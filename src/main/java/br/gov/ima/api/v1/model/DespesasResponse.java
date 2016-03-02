package br.gov.ima.api.v1.model;

import br.gov.ima.api.v1.model.LinksModel;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DespesasResponse  {
	
	
	private List<LinksModel> links = new ArrayList<LinksModel>() ;
	private String ID = null;
	private Integer anoMesEmissao = null;
	private Integer diaLancamento = null;
	private Integer diaVencimento = null;
	private String notaEmpenho = null;
	private String processoDescricao = null;
	private Integer valorEmpenho = null;
	private Integer valorLiquidado = null;
	private Integer valorALiquidar = null;
	private Integer valorPago = null;
	private Integer valorAPagar = null;
	private Integer valorAcrescimoEmpenho = null;
	private Integer valorAcrescimoLiquidado = null;
	private Integer valorAcrescimoALiquidar = null;
	private Integer valorAcrescimoPago = null;
	private Integer valorAcrescimoAPagar = null;

	
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
	 * Ano e MÃªs da EmissÃ£o da Nota de Empenho
	 **/
	@JsonProperty("anoMesEmissao")
	public Integer getAnoMesEmissao() {
		return anoMesEmissao;
	}
	
	public void setAnoMesEmissao(Integer anoMesEmissao) {
		this.anoMesEmissao = anoMesEmissao;
	}
	
	/**
	 * Ano , Mes e Dia do LanÃ§amento da Nota de Empenho
	 **/
	@JsonProperty("diaLancamento")
	public Integer getDiaLancamento() {
		return diaLancamento;
	}
	
	public void setDiaLancamento(Integer diaLancamento) {
		this.diaLancamento = diaLancamento;
	}
	
	/**
	 * Ano , Mes e Dia do Vencimento da Nota de Empenho
	 **/
	@JsonProperty("diaVencimento")
	public Integer getDiaVencimento() {
		return diaVencimento;
	}
	
	public void setDiaVencimento(Integer diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	
	/**
	 * Numero da Nota de Empenho
	 **/
	@JsonProperty("notaEmpenho")
	public String getNotaEmpenho() {
		return notaEmpenho;
	}
	
	public void setNotaEmpenho(String notaEmpenho) {
		this.notaEmpenho = notaEmpenho;
	}
	
	/**
	 * Numero do Processo de Compra
	 **/
	@JsonProperty("processoDescricao")
	public String getProcessoDescricao() {
		return processoDescricao;
	}
	
	public void setProcessoDescricao(String processoDescricao) {
		this.processoDescricao = processoDescricao;
	}
	
	/**
	 * Valor Empenhado
	 **/
	@JsonProperty("valorEmpenho")
	public Integer getValorEmpenho() {
		return valorEmpenho;
	}
	
	public void setValorEmpenho(Integer valorEmpenho) {
		this.valorEmpenho = valorEmpenho;
	}
	
	/**
	 * Valor Liquidado
	 **/
	@JsonProperty("valorLiquidado")
	public Integer getValorLiquidado() {
		return valorLiquidado;
	}
	
	public void setValorLiquidado(Integer valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}
	
	/**
	 * Valor a Liquidar
	 **/
	@JsonProperty("valorALiquidar")
	public Integer getValorALiquidar() {
		return valorALiquidar;
	}
	
	public void setValorALiquidar(Integer valorALiquidar) {
		this.valorALiquidar = valorALiquidar;
	}
	
	/**
	 * Valor Pago
	 **/
	@JsonProperty("valorPago")
	public Integer getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(Integer valorPago) {
		this.valorPago = valorPago;
	}
	
	/**
	 * Valor a Pagar
	 **/
	@JsonProperty("valorAPagar")
	public Integer getValorAPagar() {
		return valorAPagar;
	}
	
	public void setValorAPagar(Integer valorAPagar) {
		this.valorAPagar = valorAPagar;
	}
	
	/**
	 * Valor de AcrÃ©scimo do Empenho
	 **/
	@JsonProperty("valorAcrescimoEmpenho")
	public Integer getValorAcrescimoEmpenho() {
		return valorAcrescimoEmpenho;
	}
	
	public void setValorAcrescimoEmpenho(Integer valorAcrescimoEmpenho) {
		this.valorAcrescimoEmpenho = valorAcrescimoEmpenho;
	}
	
	/**
	 * Valor de AcrÃ©scimo Liquidado
	 **/
	@JsonProperty("valorAcrescimoLiquidado")
	public Integer getValorAcrescimoLiquidado() {
		return valorAcrescimoLiquidado;
	}
	
	public void setValorAcrescimoLiquidado(Integer valorAcrescimoLiquidado) {
		this.valorAcrescimoLiquidado = valorAcrescimoLiquidado;
	}
	
	/**
	 * Valor de AcrÃ©scimo a Liquidar
	 **/
	@JsonProperty("valorAcrescimoALiquidar")
	public Integer getValorAcrescimoALiquidar() {
		return valorAcrescimoALiquidar;
	}
	
	public void setValorAcrescimoALiquidar(Integer valorAcrescimoALiquidar) {
		this.valorAcrescimoALiquidar = valorAcrescimoALiquidar;
	}
	
	/**
	 * Valor de AcrÃ©cimo Pago
	 **/
	@JsonProperty("valorAcrescimoPago")
	public Integer getValorAcrescimoPago() {
		return valorAcrescimoPago;
	}
	
	public void setValorAcrescimoPago(Integer valorAcrescimoPago) {
		this.valorAcrescimoPago = valorAcrescimoPago;
	}
	
	/**
	 * Valor de AcrÃ©scimo a Pagar
	 **/
	@JsonProperty("valorAcrescimoAPagar")
	public Integer getValorAcrescimoAPagar() {
		return valorAcrescimoAPagar;
	}
	
	public void setValorAcrescimoAPagar(Integer valorAcrescimoAPagar) {
		this.valorAcrescimoAPagar = valorAcrescimoAPagar;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class DespesasResponse {\n");
		
		sb.append("  links: ").append(links).append("\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  anoMesEmissao: ").append(anoMesEmissao).append("\n");
		sb.append("  diaLancamento: ").append(diaLancamento).append("\n");
		sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
		sb.append("  notaEmpenho: ").append(notaEmpenho).append("\n");
		sb.append("  processoDescricao: ").append(processoDescricao).append("\n");
		sb.append("  valorEmpenho: ").append(valorEmpenho).append("\n");
		sb.append("  valorLiquidado: ").append(valorLiquidado).append("\n");
		sb.append("  valorALiquidar: ").append(valorALiquidar).append("\n");
		sb.append("  valorPago: ").append(valorPago).append("\n");
		sb.append("  valorAPagar: ").append(valorAPagar).append("\n");
		sb.append("  valorAcrescimoEmpenho: ").append(valorAcrescimoEmpenho).append("\n");
		sb.append("  valorAcrescimoLiquidado: ").append(valorAcrescimoLiquidado).append("\n");
		sb.append("  valorAcrescimoALiquidar: ").append(valorAcrescimoALiquidar).append("\n");
		sb.append("  valorAcrescimoPago: ").append(valorAcrescimoPago).append("\n");
		sb.append("  valorAcrescimoAPagar: ").append(valorAcrescimoAPagar).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
