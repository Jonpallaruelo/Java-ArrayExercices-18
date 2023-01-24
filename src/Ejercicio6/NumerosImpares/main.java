package Ejercicio6.NumerosImpares;

//  crear programa que muestre el producto de los primeros 10 números impares.
// Primeros 10 numeros impares: 1,3,5,7,9,11,13,15,17,19.
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      long productoImpares=1;
      
      for(int i=1;i<20;i+=2)
      {
    	  productoImpares = productoImpares *i;
    	  
      }
      System.out.println("El resultado de multiplicar los 10 primeros numeros es "+productoImpares);
	}

}
