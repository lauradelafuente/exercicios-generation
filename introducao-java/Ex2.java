package Plataforma;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n1,n2,n3;
		
		System.out.println("Entre com um n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Entre com um segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Entre com um terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1<n2 && n2<n3)
		{
			System.out.println("O n�meros na ordem crescente s�o: "+n1+n2+n3);
		}
		else if (n1<n3 && n3<n2)
		{
			System.out.println("O n�meros na ordem crescente s�o: "+n1+n3+n2);
		}
		else if (n2<n1 && n1<n3)
		{
			System.out.println("O n�meros na ordem crescente s�o: "+n2+n1+n3);
		}
		else if (n2<n3 && n1<n2)
		{
			System.out.println("O n�meros na ordem crescente s�o: "+n2+n3+n1);
		}
		else if (n3<n1 && n1<n2)
		{
			System.out.println("O n�meros na ordem crescente s�o: "+n3+n1+n2);
		}
		else 
		{
			System.out.println("O n�meros na ordem crescente s�o: "+n3+n2+n1);
		}
			
	}

}
