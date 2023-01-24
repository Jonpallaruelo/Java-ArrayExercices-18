package Ejercicio13.ImprimirArray;

import java.util.Scanner;

//Guardar programa que nos permita guardar 10 numeros enteros y nos ordene los numeros de la siguiente manera.
//Primero, ultimo, segundo, el penultimo, el tercero.

public class main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] array= new int[10];
		int j;
		for( j=0;j<array.length;j++)
		{
			System.out.println("introduce un numero"+(j+1));
			array[j]= sc.nextInt();
			
		}
		System.out.println("mostrar los numeros");
		for (j=0;j<5;j++)
		{
			
			System.out.println(array[j]);
			System.out.println(array[9-j]);
		}

	}

}
