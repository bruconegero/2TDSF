package br.com.fiap.bean;

import java.util.Calendar;

public class Carro {
	
	//Como se declara uma Constante?
	public static final String EXEMPLO_TESTE = "teste";
	
	//public, private
	//protected -> no mesmo pacote e nas filhas (herança)
	//default/package -> no mesmo pacote
	
	private String cor;
	
	private Transmissao cambio;
	
	private Calendar dataLancamento;
	
	
	public String getcor() {
		return this.cor;	
	}
	
	public void setCor(String cor) {
		this.cor = cor; 
	}

	public Transmissao getCambio() {
		return cambio;
	}

	public void setCambio(Transmissao cambio) {
		this.cambio = cambio;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	
	
}

