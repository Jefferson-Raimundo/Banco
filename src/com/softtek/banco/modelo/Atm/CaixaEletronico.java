package com.softtek.banco.modelo.Atm;

import com.softtek.banco.modelo.Conta;
import com.softtek.banco.modelo.Pagamentos.DocumentoEstornavel;
import com.softtek.banco.modelo.Pagamentos.DocumentoPagavel;

public class CaixaEletronico {
	//aqui temos polimorfismo
	public void imprimirSaldo(Conta conta) {

		System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
		System.out.println("Titular: " + conta.getTitular().getNome());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Saldo Disponivel: " + conta.getSaldoDisponivel());
		
	}
	
	public void pagar(DocumentoPagavel documento,Conta conta) {
		
		if (documento.estaPago()) {
			
			throw new IllegalStateException("Documento não esta pago");
		}
		
		conta.sacar(documento.getValorTotal());
		documento.quitarPagamento();
				
	}
	
	public void estornarDocumento(DocumentoEstornavel documento,Conta conta) {
		if (!documento.estaPago()) {
			
			throw new IllegalStateException("Documento não está pago");
		}
		
		conta.depositar(documento.getValorTotal());
		documento.estornarPagamento();
		
	}
}
