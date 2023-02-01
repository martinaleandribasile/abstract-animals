package org.java.animals;

public class Main {

	public static void main(String[] args) {
		Cane cane = new Cane();
		System.out.println("Il cane");
		cane.verso();
		cane.mangia();
		cane.dormi();
		
		Aquila aquila = new Aquila();
		System.out.println("L'aquila");
		aquila.verso();
		aquila.mangia();
		aquila.dormi();
		
		Delfino delfino = new Delfino();
		System.out.println("Il delfino");
		delfino.verso();
		delfino.mangia();
		delfino.dormi();
		
		Passerotto passerotto = new Passerotto();
		System.out.println("Il passerotto");
		passerotto.verso();
		passerotto.mangia();
		passerotto.dormi();
	}

}
