package Ejercicio12.ArrayInverso;

import java.util.Scanner;

//Programa que guarde los cinco numeros en un array y los muestre en orden inverso.

public class Main {

	public static void main(String[] args) {
		
		int arr[]= new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("introduzca numeros");
			arr[i]= sc.nextInt();
			
		}
		
		System.out.println("los numeros inversos son");
		
		int j=4;
		while(j>=0)
		{
			
			System.out.println(arr[j]);
			j--;
			
		}
		
	}

}
