package com.softtek.banco.app;

import com.softtek.banco.modelo.ContaEspecial;
import com.softtek.banco.modelo.ContaInvestimento;
import com.softtek.banco.modelo.Pessoa;
import com.softtek.banco.modelo.Atm.CaixaEletronico;
import com.softtek.banco.modelo.Pagamentos.Boleto;
import com.softtek.banco.modelo.Pagamentos.DocumentoPagavel;
import com.softtek.banco.modelo.Pagamentos.Holerite;

public class Principal {
	
	public static void main(String[] args) {
		                  //esta ação instancia o objeto em memoria
		Pessoa titular1 = new Pessoa();
		titular1.setNome("Jefferson Raimundo");
		titular1.setDocumento("15901308808");
		                  //esta ação instancia o objeto em memoria
		Pessoa titular2 = new Pessoa();
		titular2.setNome("Miriam Botari");
		titular2.setDocumento("25456198761");

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		//esta ação instancia o objeto em memoria
		ContaInvestimento minhaConta = new ContaInvestimento(titular1,123,987);

		//esta ação instancia o objeto em memoria
		ContaEspecial suaConta = new ContaEspecial(titular1,222,888,1_000);
		
		minhaConta.depositar(10_000);
		minhaConta.sacar(1_000);
		//minhaConta.creditarRendimento(0.8);
		//minhaConta.debitarTarifaMensal();
		
		try {
		suaConta.depositar(15_000);
        suaConta.sacar(15_500);		
        suaConta.debitarTarifaMensal();
        
        Boleto boletoEscola = new Boleto(titular1 , 800);
        Holerite salarioFuncionario = new Holerite(titular1,100,160);
        
        caixaEletronico.pagar(boletoEscola, minhaConta);
        caixaEletronico.pagar(salarioFuncionario,minhaConta);

        caixaEletronico.estornarDocumento(boletoEscola, minhaConta);

        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();
		} catch (Exception e) {
			System.out.println("Erro ao fazer operação em conta " + e.getMessage());
		}
			
		
        //System.out.println("Boleto Pago: " + boletoEscola.estaPago());
        //System.out.println("Holerite Pago: " + salarioFuncionario.estaPago());
        
        
        caixaEletronico.imprimirSaldo(minhaConta);
    	System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);
	}

}
