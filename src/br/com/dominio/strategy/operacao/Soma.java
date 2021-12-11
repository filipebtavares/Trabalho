
package br.com.dominio.strategy.operacao;


import br.com.dominio.strategy.CalcularCarrinho;

public class Soma implements CalcularCarrinho{

	@Override
	public int operacao(int num1, int num2) {
	
		return num1 + num2;
	
	}

}
