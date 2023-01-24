package Ejercicio16.Mover;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= new int[10];
		int ultimo;
		Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
        	System.out.println("introduce un numro entero");
        	
        	array[i]=sc.nextInt();
        }
        
        ultimo= array[9];
        
        for(int i=8;i>=0;i--)
        {
        	array[i+1]=array[i];
        	
        }
        array[0]=ultimo;
        
        
        System.out.println("Mostrar arreglo desplazado una posicion");
        for(int i=0;i<10;i++)
        {
        	System.out.println(array[i]);
        }
        
       
	}

}
