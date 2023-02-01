package org.java.animals;

import org.java.animals.interfaccia.Nuota;

public class Delfino extends Animale implements Nuota{

	
	public void mangia() {
		System.out.println("Mangia: Pesciolini");
		
	}

	
	public void verso() {
		System.out.println("Verso: Trrrrrrr");
		
	}


	public void nuota() {
		System.out.println("Sto nuotando!");
	}


}
