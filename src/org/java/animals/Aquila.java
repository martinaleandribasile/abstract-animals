package org.java.animals;

import org.java.animals.interfaccia.Vola;

public class Aquila extends Animale implements Vola{

	
	public void mangia() {
		System.out.println("Mangia: Carne,Animaletti");
		
	}

	
	public void verso() {
		System.out.println("Verso: Eaaa Eaaa");
		
	}

	public void vola() {
		System.out.println("Sto volando");
		
	}

}
