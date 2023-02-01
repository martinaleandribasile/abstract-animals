package org.java.animals.interfaccia;

import org.java.animals.Aquila;
import org.java.animals.Cane;
import org.java.animals.Delfino;
import org.java.animals.Passerotto;

public class Main {
//esempio con i metodi inseriti in una classe specifica Azione
	public static void main(String[] args) {
		Azione a = new Azione();
		Aquila aquila = new Aquila();
		a.faiVolare(aquila);
		
		Delfino delfino = new Delfino();
		a.faiNuotare(delfino);
		
		Passerotto passerotto = new Passerotto();
		a.faiVolare(passerotto);
		
		Cane cane = new Cane();
		a.faiNuotare(cane);
		
	}
	
	// esempio con i metodi dichiarati direttamente dentro il main
//	public static void main(String[] args) {
//		
//		Aquila aquila = new Aquila();
//		faiVolare(aquila);
//		
//		Delfino delfino = new Delfino();
//		faiNuotare(delfino);
//		
//		Passerotto passerotto = new Passerotto();
//		faiVolare(passerotto);
//		
//		Cane cane = new Cane();
//		faiNuotare(cane);
//		
//	}
//	
//	public static void faiVolare(IVolante x) {
//		x.vola();
//	}
//	public static void faiNuotare(INuotante y) {
//		y.nuota();
//	}
}
