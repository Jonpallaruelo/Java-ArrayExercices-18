package Ejercicio1.CalcularArrayMayor;
import java.util.Scanner;
//Programa que nos muestre cual es la posicion mayor del array.
public class Principal {

	public static void main(String[] args) {
		
		int[] array= new int[5];
		
		int mayor=array[0];
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese los cinco numeros");
		
		for(int i= 0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]>mayor)
			{
				
				mayor=array[i];
			
		}
				  }
		System.out.println("el array mayores es"+mayor);
		
	}
}
