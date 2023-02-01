package org.java.animals;

import org.java.animals.interfaccia.Vola;

public class Passerotto extends Animale implements Vola {

	
	public void mangia() {
		System.out.println("Mangia: Vermetti");		
	}

	
	public void verso() {
		System.out.println("Verso: Cip Cip");
		
	}
	
	public void vola() {
		System.out.println("Sto volando");
		
	}

}
