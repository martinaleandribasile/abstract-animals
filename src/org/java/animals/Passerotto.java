package org.java.animals;

import org.java.animals.interfaccia.IVolante;


public class Passerotto extends Animale implements IVolante {

	
	public void mangia() {
		System.out.println("Mangia: Vermetti");		
	}

	
	public void verso() {
		System.out.println("Verso: Cip Cip");
		
	}
	
	public void vola() {
		System.out.println("sono un passerotto, Sto volando");
		
	}

}
