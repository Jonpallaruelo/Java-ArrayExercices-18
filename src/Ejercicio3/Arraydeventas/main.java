package Ejercicio3.Arraydeventas;

import java.util.Scanner;

//Calcular las 30 ventas del mes.
//Que diga cuales son y cuantas son mayores de 200 €

public class main {

	public static void main(String[] args) {

		double ventas[] = new double[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese las 30 ventas del mes");
		for (int i = 0; i < ventas.length; i++) {
			System.out.println("Venta" + (i + 1));
			ventas[i] = sc.nextDouble();

		}
		int k = 0;
		int totales = 0;

		while (k < 5) {
			if (ventas[k] >= 200) {

				
				System.out.println("venta de"+ ventas[k]+"€");
				totales++;

			}

			k++;

		}
		System.out.println("El numero total de ventas mayores han sido " + totales);

	}
}
