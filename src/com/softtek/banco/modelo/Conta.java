package com.softtek.banco.modelo;

import java.util.Objects;
             //A classe Conta é uam superclasse - Classe Pai
public abstract class Conta {
	
	private Pessoa titular;
	
	private int agencia;
	private int numero;
    private double saldo;

    //CONSTRUTOR SEM ARGUMENTOS
    Conta(){
    }
    
    //MONTANDO CONSTRUTOR COM CONTROLE
    public Conta(Pessoa titular,int agencia,int numero) {
    	//VALIDAR SE TITULAR NULL
    	Objects.requireNonNull(titular);
    	
    	this.titular = titular;
    	this.agencia = agencia;
    	this.numero = numero;
    	    	
    }
    
    //METODO INSTANCIA
    public void depositar(double valor) {
    	if (valor <= 0) {
    		throw new IllegalArgumentException("Valor deve ser maior que 0");
    		
    	}
    	
       saldo = saldo + valor;  	
    }
    
    public void sacar(double valor) {
    	if (valor <= 0) {
    		throw new IllegalArgumentException("Valor deve ser maior que 0");
    		
    	}

   	
    	if (getSaldoDisponivel() - valor < 0) {
    		throw new IllegalStateException("Saldo insuficiente");
    	}
    	
    	saldo = saldo - valor;
    }
    	 
    //VAMOS FAZER UAM SOBRE CARGA DE METODOS 
    public void sacar(double valor,double taxaSaque) {
    	
    	sacar(valor + taxaSaque);
    	
    }
    //sempre que um metodo abstrato for criado as calsses devem implementar 
    public abstract void debitarTarifaMensal(); 
    
    //AQUI METODOS Getters and  Setters - Javabeans

	public Pessoa getTitular() {
		return titular;
	}
    //Nao vou permitir alterar nome da pessoa na classe contas
	//public void setTitular(Pessoa titular) {
	//	this.titular = titular;
	//}

	public int getAgencia() {
		return agencia;
	}
    //Nao vou permitir alterar a agencia
	/*public void setAgencia(int agencia) {
	*	this.agencia = agencia;
	}*/

	public int getNumero() {
		return numero;
	}
	
    //Nao vou permitir alterar o numero da conta
	//public void setNumero(int numero) {
	//	this.numero = numero;
	//}

	public double getSaldo() {
		return saldo;
	}

	//Não vou permitir alterar o saldo
	//public void setSaldo(double saldo) {
	//	this.saldo = saldo;
	//}
    	
	public double getSaldoDisponivel() {
		return getSaldo();
	}
	
    }
