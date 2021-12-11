
package br.com.dominio.construcao.facade;

import br.com.dominio.construcao.produtos.Cimento;
import br.com.dominio.construcao.produtos.Brita;
import br.com.dominio.construcao.produtos.Areia;
import br.com.dominio.construcao.produtos.Tijolo;

public class ConstrucaoFacade {

	private Cimento cimento;
	private Brita brita;
	private Areia areia;
	private Tijolo tijolo;

	public ConstrucaoFacade() {

		this.cimento = new Cimento();
		this.brita = new Brita();
		this.areia = new Areia();
		this.tijolo= new Tijolo();

	}

	public void montarCarrinho() {
		System.out.println("Montando um novo carinho\n");
		
		cimento.adicionarCimento();
		brita.adicionarBrita();
		areia.adicionarAreia();
		tijolo.adicionarTijolo();
		
		System.out.println("\nCarrinho Pronto");
	}

}