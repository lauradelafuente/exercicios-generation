//Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.

package ExPlataforma;

import java.util.Scanner;

public class ex2vetores {
	
	public static void main (String args [])
	{
		int [] num = new int [6];
		int ent=0,par=0,somapar=0,x,imp=0,qntimp=0;
		Scanner leia = new Scanner (System.in);
		
		for (x=0;x<6;x++)
		{
			System.out.println("Insira um  n�mero: ");
			num[x] = leia.nextInt();
		
			if (num[x] % 2==0)
			{
				somapar+=num[x];
				par++;
			}
			else
			{
				qntimp++;
			}
		}
		System.out.println("\nOs n�meros pares diditados foram: ");
		for (x=0;x<6;x++)
		{
			if (num[x] % 2==0)
			{
				System.out.println(num[x]+" ");
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados: "+somapar);
		
		System.out.println("\nOs n�meros �mpares digitados foram: ");
		for (x=0;x<6;x++)
		{
			if (num[x] % 2==1)
			{
				System.out.println(num[x]+" ");
			}
		}
		System.out.println("\nA quantidade de n�meros �mpares: "+qntimp);
	}

}
