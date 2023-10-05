package com.softtek.banco.modelo;
             //Essa classe é uma subclasse - classe filha
                               //esta atribuição indica HERANÇA "extends"
public class ContaInvestimento extends Conta {
	
	//montar o contrutor 
	public ContaInvestimento (Pessoa titular,int agencia,int numero) {
		
		super(titular,agencia,numero);
		
		
	}
	
	//METODOS
	
	public void creditarRendimento(double percentualJuros) {
		
		double valorRendimentos = getSaldo() * percentualJuros /100; 
		depositar(valorRendimentos);
		
	}

	@Override
	public void debitarTarifaMensal() {
		// TODO Auto-generated method stub
		if (getSaldo() < 10_000) {
			sacar(30);
		}
		
	}

	
	
}
