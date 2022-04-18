package model;

import java.util.Scanner;

public class Factorial extends Thread {

	@Override
	public void run() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Calcular la función factorial de un numero");
		System.out.print("Digite numero: ");
		long factorial = 1;
		int numero = leer.nextInt();
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		System.out.println("El factorial de " + numero + " es " + factorial);
		leer.close();
	}

}
