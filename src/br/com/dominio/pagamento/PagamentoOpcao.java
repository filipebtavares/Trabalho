package br.com.dominio.pagamento;



public class PagamentoOpcao {

	public static Pagamento getPagamento(int i){
		if(i == 1 ){
			return new PagamentoCarne();
		}else if(i == 2){
			return new PagamentoBoleto();
		
		}else{
			return new PagamentoBoleto();
		}
	}
}