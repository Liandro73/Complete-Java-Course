package br.com.liandro.contrut_encapsulamento;

public class Conta {
	
	Integer numeroConta;
	private Double saldo;
	private Double depInicial;
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getDepInicial() {
		return depInicial;
	}
	
	public void setDepInicial(Double depInicial) {
		this.depInicial = depInicial;
	}
	
	public Double fazerDepositoIncial() {
		return saldo += depInicial;
	}
	
	public Double fazerDeposito(Double deposito) {
		return saldo += deposito;
	}
	
	public Double fazerSaqueComTarifa(Double saque) {
		return saldo -= saque + 5.00;
	}
		
	public String toString() {
		return ", Balance: $ " + String.format("%.2f", saldo); 
	}
	
}
