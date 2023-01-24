package Ejercicio5Numeros;

import java.util.Scanner;

// Crear programa que este pidiendo numeros enteros.
//cuando un cero se haya introducido, finalizará la captura de datos.
//Sumar los números enteros y mostrar en pantalla.
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num= 0;
         int suma=0;
         Scanner sc= new Scanner(System.in);
        
         do {
        	 System.out.println("introduce un numero");	 
        	
        	 num=sc.nextInt();
        	 suma= suma +num;
        	 
        	 
        	 
         }while(num!=0);
         
         System.out.println("la suma total es"+suma);   
	}
	 

}
