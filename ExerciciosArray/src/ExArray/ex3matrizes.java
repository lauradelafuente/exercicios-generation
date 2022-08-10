//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
package ExPlataforma;

import java.util.Scanner;

public class ex3matrizes {
	
	public static void main (String args[])
	{
		int [][] matriz = new int[3][3];
		int num,l,c,qntnum=0;
		Scanner leia = new Scanner (System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Insira um valor: ");
				num = leia.nextInt();
				
				if (num>10)
				{
					qntnum++;
				}
			}
			
		}
		System.out.println("A quantidade de números maiores que 10 é: "+qntnum);
	}

}
