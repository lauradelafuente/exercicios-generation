package Plataforma;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n1,n2,n3;
		
		System.out.println("Entre com um 1 n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Entre com um 2 n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Entre com um 3 n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > 3)
		{
			System.out.println("\nO n�mero "+n1+" � o maior");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("\nO n�mero "+n2+" � o maior");
		}
		else
		{
			System.out.println("\nO n�mero "+n3+" � o maior");
		}
	}

}
