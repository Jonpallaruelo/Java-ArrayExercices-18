package Ejercicio7.Promedio.cantidadceros;

import java.util.Scanner;

// El programa pedira 10 numeros enteros.
// y mostrara el promedio de los que sean negativos y positivos.
// y nos dira cuantos ceros fueron ingresados.
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num=0;
		int cantidadNegativos=0;
		int cantidadPositivos=0;
		int sumaNegativos=0, sumaPositivos=0,cantidadCeros=0;
		double promedioPositivos=0, promedioNegativos=0;
		
		int k=0;
		Scanner sc= new Scanner(System.in);
		while(k<10)
		{
			System.out.println("Introduce un numero");
			num=sc.nextInt();
			if(num==0)cantidadCeros++;
			else if (num>0)
			{
				cantidadPositivos ++;
				sumaPositivos= sumaPositivos+num;
			}
			else {
				
				cantidadNegativos ++;
				sumaNegativos = sumaNegativos+num;
			}
			
			k++;
		}
		if(cantidadPositivos==0)System.out.println("No se puedo realizar el promedio de los positivos");
		else
		{
			
			promedioPositivos= sumaPositivos/cantidadPositivos;
			System.out.println("El promedio de los positivos es " + promedioPositivos);
			
		}
		if(cantidadNegativos==0)System.out.println("No se puede realizar el promedio de los negativos");
		else {
			promedioNegativos= sumaNegativos/cantidadNegativos;
			System.out.println("El promedio de los negativos es "+ promedioNegativos);
			
		}
      System.out.println("cantidad de ceros ingresados"+cantidadCeros);  	
	}

}
