package Ejercicio8.GestionFactura;

import java.util.Scanner;

//Crear un programa para la gestion de facturas de una empresa que se dedica a la venta de azucar por kilos.
//En cada factura se ingresara el codigo del producto vendido;
//Además se ingresará la cantidad de kilos vendida y el total a pagar por kilos.

// de 5 facturas introducidas,se pide:

//facturacion total , cantidad de kilos vendidas, y cuantas facturas fueron emitidas por mas de 1000€;
public class main {

	public static void main(String[] args) {
		String codigo="";
		int kilos=0;
		float precio=0;
		float importefactura=0;
		float facturaciontotal=0;
		int contadorFacturas=0;
		int totalkilos=0;
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("factura n"+i );
			System.out.println("Codigo del producto");
			codigo=sc.next();
			System.out.println("cantidad de kilos");
			kilos= sc.nextInt();
			System.out.println("Precio");
			precio=sc.nextFloat();
			importefactura= kilos*precio;
			facturaciontotal= importefactura+ facturaciontotal;
			totalkilos= kilos+totalkilos;
			
			if(importefactura>1000)
			{
				
				contadorFacturas++;
			}
			
		}
		System.out.println("Detalles de la venta: ");
		System.out.println("facturacion total"+facturaciontotal+"€");
		System.out.println("Total de kilos vendidos"+totalkilos);
		
		

	}

}
