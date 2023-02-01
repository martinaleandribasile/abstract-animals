package org.java.animals.interfaccia;

import org.java.animals.Aquila;
import org.java.animals.Delfino;
import org.java.animals.Passerotto;

public class Main {

	public static void main(String[] args) {
		Aquila aquila = new Aquila();
		faiVolare(aquila);
		
		Delfino delfino = new Delfino();
		faiNuotare(delfino);
		
		Passerotto passerotto = new Passerotto();
		faiVolare(passerotto);
		
	}

	public static void faiVolare(IVolante x) {
		x.vola();
	}
	public static void faiNuotare(INuotante y) {
		y.nuota();
	}
}
