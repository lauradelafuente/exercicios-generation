//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

package lacos;

import java.util.Scanner;

public class ex2for {

	public static void main (String args [])
	{
		int x,imp=0,par=0,num;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Insira um n�mero: ");
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
		System.out.println("\nA quantidade de n�meros pares �: "+par);
		System.out.println("\nA quantidade de n�meros �mapres �: "+imp);
	}
}
