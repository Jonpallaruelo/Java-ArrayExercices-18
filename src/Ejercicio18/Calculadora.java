package Ejercicio18;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int a=0,b=0,res=0;
		String sel= null;
		System.out.println("Seleciona la opcion");
		Scanner sc= new Scanner(System.in);
		System.out.println("+:suma"
		             +"\n-:Resta"
				     +"\nx:Multiplicacion"
		             +"\n/:Division");
		sel=sc.next();
		
		
        switch(sel) {
        
        case "+":
        	System.out.println("ha seleccionado suma\n");
        	System.out.println("Ingrese el primer numero");
        	a=sc.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= sc.nextInt();
        	res = a+b;
        	System.out.println(a+"+"+b+"="+res);
        	break;
        	
        case "-":
        	System.out.println("ha seleccionado resta\n");
        	System.out.println("Ingrese el primer numero");
        	a=sc.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= sc.nextInt();
        	res = a-b;
        	System.out.println(a+"-"+b+"="+res);
        	break;
        	
        case "x":
        	System.out.println("ha seleccionado multiplicacion\n");
        	System.out.println("Ingrese el primer numero");
        	a=sc.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= sc.nextInt();
        	res = a*b;
        	System.out.println(a+"*"+b+"="+res);
        	break;
        case "/":
        	System.out.println("ha seleccionado suma\n");
        	System.out.println("Ingrese el primer numero");
        	a=sc.nextInt();
        	System.out.println("Ingrese el segundo numero");
        	b= sc.nextInt();
        	res = a / b;
        	System.out.println(a+"%"+b+"="+res);
        	break;
        	default:
        		System.out.println("Esa opcion no existe");
        
        }
	}

}
