package org.java.animals.interfaccia;

import org.java.animals.Animale;
import org.java.animals.Aquila;
import org.java.animals.Delfino;

public class Main {

	public static void main(String[] args) {
		Aquila aquila = new Aquila();
		System.out.println("L'aquila");
		faiVolare(aquila);
		
		Delfino delfino = new Delfino();
		System.out.println("Il delfino");
		faiNuotare(delfino);
		
	}

	public static void faiVolare(Vola x) {
		x.vola();
	}
	public static void faiNuotare(Nuota y) {
		y.nuota();
	}
}
