package Plataforma;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n1,n2,n3;
		
		System.out.println("Entre com um 1 número: ");
		n1 = ler.nextInt();
		System.out.println("Entre com um 2 número: ");
		n2 = ler.nextInt();
		System.out.println("Entre com um 3 número: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > 3)
		{
			System.out.println("\nO número "+n1+" é o maior");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("\nO número "+n2+" é o maior");
		}
		else
		{
			System.out.println("\nO número "+n3+" é o maior");
		}
	}

}
