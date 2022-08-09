//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

package lacos;

import java.util.Scanner;

public class ex2for {

	public static void main (String args [])
	{
		int x,imp=0,par=0,num;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			if(num % 2 == 0)
			{
				par++;
			}
			else 
			{
				imp++;
			}
		}
		System.out.println("\nA quantidade de números pares é: "+par);
		System.out.println("\nA quantidade de números ímapres é: "+imp);
	}
}
