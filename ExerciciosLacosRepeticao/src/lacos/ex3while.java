//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.
package lacos;

import java.util.Scanner;

public class ex3while {

	public static void main(String args[])
	{
		int idade,menor=0,maior=0,cont=0;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99)
		{
			if(idade<21)
			{
				menor++;
			}
			else if (idade>50)
			{
				maior++;
			}
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("O total de pessoas com menos de 21 anos é: "+menor);
		System.out.println("O total de pessoas com mais de 50 anos é: "+maior);
	}
}
