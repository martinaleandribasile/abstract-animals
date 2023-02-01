package org.java.animals.interfaccia;

public class Azione {
	public static void faiVolare(IVolante x) {
		x.vola();
	}
	public static void faiNuotare(INuotante y) {
		y.nuota();
	}
}
