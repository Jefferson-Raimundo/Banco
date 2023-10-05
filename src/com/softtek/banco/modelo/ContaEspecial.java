package com.softtek.banco.modelo;

public class ContaEspecial extends Conta {

	private double valorLimite;

	public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimite) {
		super(titular, agencia, numero);
	    this.valorLimite = valorLimite;
	}


	
	
	//FAZER UMA SUB-ESCRITA DE METODOS DA SUPERCLASSE - OVERRAIDE
	@Override
	public void debitarTarifaMensal() {
		// TODO Auto-generated method stub
		sacar(20);
		
	}
	
	@Override
	public double getSaldoDisponivel() {

		return getSaldo() + getValorLimite();
	}
	

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}




	
	

	
}
