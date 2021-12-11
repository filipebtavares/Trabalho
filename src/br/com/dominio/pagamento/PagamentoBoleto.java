
 package br.com.dominio.pagamento;

import javax.swing.JOptionPane;

public class PagamentoBoleto implements Pagamento{
	
	@Override
	public void enviar(String pagamento) {
		JOptionPane.showMessageDialog(null, "Forma de pagamento Boleto: " + pagamento);
	}

}