package br.com.dominio;

import javax.swing.JOptionPane;


import br.com.dominio.pagamento.Pagamento;
import br.com.dominio.pagamento.PagamentoOpcao;
import br.com.dominio.strategy.MatematicaContexto;
import br.com.dominio.strategy.operacao.Soma;
import br.com.dominio.construcao.facade.ConstrucaoFacade;

public class Principal {
	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog(null);
		
		Pagamento mensagem = PagamentoOpcao.getPagamento(2);
		mensagem.enviar(texto);
		
		ConstrucaoFacade facade = new ConstrucaoFacade();
		facade.montarCarrinho();
		
		MatematicaContexto math = new MatematicaContexto(new Soma());
		
		System.out.println(math.operacao(80, 100));
		
	}
}