package com.softtek.banco.modelo.Pagamentos;

public interface DocumentoPagavel {
	
	double getValorTotal();
	boolean estaPago();
	
	void quitarPagamento();
	
	default void imprimirRecibo() {
		
		System.out.println("RECIBO");
		System.out.println("valor total: " + getValorTotal());
		System.out.println("Pago: " + estaPago());
	}

}
