package br.com.cursojava.banco.util;

import br.com.cursojava.banco.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}
	
	

}
