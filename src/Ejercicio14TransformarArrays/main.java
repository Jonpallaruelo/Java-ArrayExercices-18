package Ejercicio14TransformarArrays;

import java.util.Scanner;

//Crear 2 arreglos, e introducir en cada uno, 10 número enteros.
//Y mezclarlos en un tercer arreglo. De la siguiente forma:
//El 1 de a, el 1 de b, el 2 de a, el 2 de b,el 3 de a, el 3 de b... etc


/*0
 *  a             b               c
0    100          50             100   
1    101          51              50
2    102          52             101
3    103          53             51
4    104          54             102
5    105          55             52
6    106          56             103
7    107          57             53
8    108          58
9    109          59

*/

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a []= new int[10];
		int b []= new int [10];
		int c[]= new int [20];
		int i, j;
		Scanner sc= new Scanner(System.in);
		System.out.println("introducir datos en el array 'a' ");
		
		for( i=0;i<a.length;i++)
		{
			System.out.println("posicion"+(i+1)+":");
			a[i]=sc.nextInt();
			
		}
		System.out.println("introducir datos  en el array 'b'");
		for(i=0;i<b.length;i++)
		{
			System.out.println("posicion"+(i+1)+":");
			b[i]=sc.nextInt();
			
		}
				
			System.out.println("Pasar los daros al array c");
			j=0;
			for(i=0;i<10;i++)
			{
				c[j]=a[i];
				System.out.println(c[j]);
			
			j++;
				
			c[j]=b[i];
			System.out.println(c[j]);
			j++;
			}
		
	}

}
