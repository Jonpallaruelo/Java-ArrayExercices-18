package ejercicio11.Alumnos.JOptionPane;

import javax.swing.JOptionPane;

//programa que nos pida dni del alumno y su nota del año,
// si es 5 nos dira que es un alumno que a recuperado, si es mayor habra aprobado durante el año.
public class main {

	public static void main(String[] args) {
		int calificacion=0;
		boolean recuperado=false;
		String dni="";
		
		for(int i=0;i<5;i++)
			
		{
			dni=JOptionPane.showInputDialog("alumno"+(i+1)+"\n"+"introduce el dni del alumno");
			calificacion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del alumno"));
			
			if(calificacion<6) recuperado=true;
			if(recuperado==true)
			{
				
				JOptionPane.showMessageDialog(null,"El alumno"+dni+"Ha recuperado");
			}
			
			else {
				JOptionPane.showMessageDialog(null, "El alumno"+dni+"ha aprobado durante el año");
			}
			
			
		}

	}

}
