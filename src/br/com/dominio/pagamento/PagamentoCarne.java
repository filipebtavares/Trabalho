package br.com.dominio.pagamento;

import javax.swing.JOptionPane;


public class PagamentoCarne implements Pagamento{

	@Override
	public void enviar(String pagamento) {
		JOptionPane.showMessageDialog(null, "Forma de pagamento de Carnê: " + pagamento);
	}

}