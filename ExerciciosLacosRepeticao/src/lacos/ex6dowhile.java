// programa que receba v�rios n�meros inteiros no teclado. E no
//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
package lacos;

import java.util.Scanner;

public class ex6dowhile {

	public static void main (String args[])
	{
		double num=0,mult,media=0,somanum=0,cont=0;
		
		Scanner leia = new Scanner (System.in);
		
		do 
		{
		System.out.println("Entre com um n�mero: ");
		num = leia.nextDouble();
			if (num !=0 && num % 3 == 0)
			{
				somanum+=num;
				cont++;
			}
		}
		while (num != 0);
		
		media = somanum/cont;
		System.out.println("A m�dia dos n�meros m�ltiplos de tr�s �: "+media);
	}
	
}
