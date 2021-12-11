
package br.com.dominio.strategy;



	public class MatematicaContexto {
		private CalcularCarrinho strategy;

		public MatematicaContexto(CalcularCarrinho strategy) {

			this.strategy = strategy;

		}
	
		public int operacao(int num1, int num2){
		
			return strategy.operacao(num1, num2);
		
		}
}