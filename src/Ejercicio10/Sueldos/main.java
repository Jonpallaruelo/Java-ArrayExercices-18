package Ejercicio10.Sueldos;

//programa que nos pida cuantos sueldos queremos capturar y calcule muestre  cual de todos ha sido el mayor.

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadSueldos=0;
		int sueldo=0,sueldoMaximo=0;
		boolean primerSueldo= false;
		cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos sueldos quieres capturar")); 
		
		for(int i=1;i<=cantidadSueldos;i++)
			
		{
			sueldo=Integer.parseInt(JOptionPane.showInputDialog("introduce el sueldo"+(i)));
			if(primerSueldo== false)
			{
				sueldoMaximo=sueldo;
				primerSueldo=true;
			}
			if(sueldo>sueldoMaximo)sueldoMaximo=sueldo;
		}
		
		JOptionPane.showMessageDialog(null, "El sueldo mayor es" + sueldoMaximo);
		
	}

}
