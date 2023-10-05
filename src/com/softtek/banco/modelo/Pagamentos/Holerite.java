package com.softtek.banco.modelo.Pagamentos;

import com.softtek.banco.modelo.Pessoa;

public class Holerite implements DocumentoPagavel {

	
	private Pessoa funcionario;
	private double valorHora;
	private int quantidadeHoras;
	private boolean pago;
	
	
	
	public Holerite(Pessoa funcionario, double valorHora, int quantidadeHoras) {
		super();
		this.funcionario = funcionario;
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
	}

	@Override
	public double getValorTotal() {
		// TODO Auto-generated method stub
		return valorHora * quantidadeHoras;
	}

	@Override
	public boolean estaPago() {
		// TODO Auto-generated method stub
		return pago;
	}

	@Override
	public void quitarPagamento() {
		// TODO Auto-generated method stub
		pago = true;
	}
	

}
