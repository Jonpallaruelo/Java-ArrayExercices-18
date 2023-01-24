package Ejercicio17ArregloCreciente;

import java.util.Scanner;

//Introducir cinco numeros enteros en un arreglo, de forma creciente, y ordenados.
//Por ejemplo:2,4,6,8,10.
//Estos numeros se almacenaran en un arrego de tamaño 10.
//Posteriormente introduciremos un numero entero n.
//Y se insertara en el lugar correspondiente.
//Sin alterar el orden de la tabla.

public class Main {

	public static void main(String[] args) {
		
		int array[]= new int[10];
		int num, posnum;
		int j;
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("introduce los 5 numeros ordenador de forma creciente"+(i+1));
			array[i]= sc.nextInt();
		}
		
		System.out.println("introduce un numero entero");
		num=sc.nextInt();
		posnum=0;
		j=0;
		while(array[j]<num && j<=4) //num=24
		{
			posnum ++; //=3
			j++;       //=3
		}
		
		for(int i=4;i>=posnum;i--)  //posnum=3
		{
			array[i+1]=array[i];
		}
		
    array[posnum]=num;
   for(int i= 0;i <6;i++)
   {
	   System.out.println(array[i]);
   }
}
}
