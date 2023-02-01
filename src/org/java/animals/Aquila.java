package org.java.animals;

import org.java.animals.interfaccia.IVolante;

public class Aquila extends Animale implements IVolante{

	
	public void mangia() {
		System.out.println("Mangia: Carne,Animaletti");
		
	}

	
	public void verso() {
		System.out.println("Verso: Eaaa Eaaa");
		
	}

	public void vola() {
		System.out.println("sono un aquila, Sto volando");
		
	}

}
