package com.softtek.banco.modelo.Pagamentos;
                                   //aqui temos herança de interface.
public interface DocumentoEstornavel extends DocumentoPagavel{
	
	void estornarPagamento();

}
