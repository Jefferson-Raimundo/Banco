package com.softtek.banco.modelo.Pagamentos;

import com.softtek.banco.modelo.Pessoa;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel {

	private Pessoa beneficiario;
	private double valor;
	private boolean pago;

	//implenetação de um construtor
	public Boleto(Pessoa beneficiario, double valor) {
		this.beneficiario = beneficiario;
		this.valor = valor;
		this.pago = pago;
	}

	@Override
	public double getValorTotal() {
		// TODO Auto-generated method stub
		return valor;
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

	@Override
	public void estornarPagamento() {
		// TODO Auto-generated method stub
		pago = false;
	}
	
}
