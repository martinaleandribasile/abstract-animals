package org.java.animals;

import org.java.animals.interfaccia.INuotante;

public class Cane extends Animale implements INuotante {

	
	public void mangia() {
		System.out.println("Mangia: Carne");
		
	}

	
	public void verso() {
		System.out.println("Verso: Bau Bau");
		
	}

	public void nuota() {
		System.out.println("sono un cane, Sto nuotando");
		
	}

}
