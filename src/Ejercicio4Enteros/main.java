package Ejercicio4Enteros;

import java.util.Scanner;

//crear programa que nos pida capturar números positivos.
// y calcular la media o promedio de esos números.
public class main {

	public static void main(String[] args) {
		int numero=0;
		int suma=0;
		int cantidadNumeros=0;
		double media=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("introduce un numero (positivo)");
		numero=sc.nextInt();
		while(numero>0)
		{
			suma= suma+ numero;
			cantidadNumeros ++;
			System.out.println("introduzca otro numero");
			numero= sc.nextInt();
		}
		if(cantidadNumeros==0)
		{
			System.out.println("No se puede realiar la media");
		}
		else {
			
			media=suma/cantidadNumeros;
			System.out.println("la media es:"+ media);
		}
		
		
	}

}
