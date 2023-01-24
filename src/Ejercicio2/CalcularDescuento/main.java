package Ejercicio2.CalcularDescuento;
import java.util.Scanner;

//cada trozo de pan tiene un precio de 5 euros.
//Si el cliente compra mas de 50 panes, le costara 4,50 euros.
//Si el cliente compra mas de 100 piezas, le costara a 4 euros.
//Programa que pida capturar la cantidad de piezas que el cliente compro, y el total que pagara.
public class main {

	public static void main(String[] args) {
		float totalPago=0;
		float cantidadDeTrozos=0;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce cuantos panes quieres comprar");
		cantidadDeTrozos= sc.nextInt();
		
		if(cantidadDeTrozos>=50 && cantidadDeTrozos<100)
			
		{
			totalPago= cantidadDeTrozos * 4.50f;
			
			
			
		}else if(cantidadDeTrozos>=100)
		{
			
			totalPago= cantidadDeTrozos * 4;
			
		}else
		{
			
			totalPago= cantidadDeTrozos * 5;
			
			
		}
		
		System.out.println("El cliente compro un total de "+cantidadDeTrozos+" panes.");
		System.out.println("EL precio total a pagar es de "+ totalPago+ "€");
	}

}
