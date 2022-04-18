package controller;

import model.Ascendente;
import model.Descendente;

public class Principal1 {
	public static void main(String[] args) {
		Ascendente a = new Ascendente();
		Descendente d = new Descendente();
		System.out.println("Contador ascendente y descendente al mismo tiempo: \n");
		a.start();
		d.start();
		
	}
}
