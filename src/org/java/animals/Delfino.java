package org.java.animals;

import org.java.animals.interfaccia.INuotante;


public class Delfino extends Animale implements INuotante{

	
	public void mangia() {
		System.out.println("Mangia: Pesciolini");
		
	}

	
	public void verso() {
		System.out.println("Verso: Trrrrrrr");
		
	}


	public void nuota() {
		System.out.println("sono un delfino, Sto nuotando");
	}


}
