package controller;

import model.L1;
import model.L2;
import model.L3;
import model.L4;

public class Principal4 {
	public static void main(String[] args) {
		L1 l1 = new L1("l1");
		L2 l2 = new L2("l2");
		L3 l3 = new L3("l3");
		L4 l4 = new L4("l4");
		System.out.println("Carrera de 4 leopardos: \n");
		l1.start();
		l2.start();
		l3.start();
		l4.start();
	}
}
