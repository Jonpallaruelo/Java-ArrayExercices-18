package Ejercicio15.MezclarArrays;
//Ingresar numeros en dos arreglos, y almacenarlos en un tercer arreglo de la siguiente forma. 

//En el arreglo a y b almacenaremos 12 numeros.
// y rellenaremos el tercer arreglo almacenado los tres primeros del arreglo a y los tres primeros del arreglo b.

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int a[] = new int[12];
		int b[] = new int[12];
		int c[] = new int[24];
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar numeros en el arreglo A");
		for(int i=0;i<12;i++)
		{
			System.out.println("ingresar el numero"+(i+1));
			a[i]=sc.nextInt();
		}
		
		System.out.println("Ingresar numeros en el arreglo b");
		for(int i=0;i<12;i++)
		{
			System.out.println("ingresar el numero"+(i+1));
			b[i]=sc.nextInt();
		}
		
		int i=0;
		int j=0;
		while(i<12)
		{
			for(int k=0;k<3;k++)
			{
				c[j]=a[i+k];
				j++;
			}
			
			for (int k=0;k<3;k++)
			{
				c[j]=b[i+k];
				j++;
			}
			i+=3;
			
		}
		System.out.println("Arreglo c:");
		for(j=0;j<16;j++)
		{
			System.out.println(c[j]);
		}

}
}
