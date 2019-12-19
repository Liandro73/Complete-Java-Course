package br.com.liandro.introducao_poo;

public class CurrencyConverter {
	
	protected static Double dolarPrice;
	protected static Double dolarBought;
	
	protected static Double converter() {
		return (dolarPrice * dolarBought) * 1.06;
	}
	

}
