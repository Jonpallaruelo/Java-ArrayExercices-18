package Ejercicio9.Alumnos;

import java.util.Scanner;

//Crear programa que nos pida seis notas de los alumnos de la escuela y en funcion de su calificación saber cuantos aprobaron, reaprobaron y si sacaron la excelencia.
public class main {

	public static void main(String[] args) {
		int aprobados=0;
		int reaprobados=0;
		int excelentes= 0;
		float nota=0;
		Scanner sc= new Scanner(System.in);
		
		int i=1;
		while(i<6)
		{
			System.out.println("introduzca una calificacion del 0 al 10");
			nota=sc.nextFloat();
			if(nota>=9 && nota<=10)
			{
				excelentes ++;
			}
			else if(nota>=6)
			{
				aprobados ++;
			}
			else
				reaprobados ++;
			i++;
		}
		
	   System.out.println("Cantidad de alumnos aprobados"+ aprobados);
	   System.out.println("cantidad de alumnos reaprobados"+ reaprobados);
	   System.out.println("cantidad de alumnos excelentes"+excelentes);

	}

}
