//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.
package lacos;

public class ex1for {

	public static void main (String args[])
	{
		int x,num=0;
		
		for (x=1000;x<=1999;x++)
		{
			if (x%11==5)
			{
				num=x;
				System.out.println("Número possível: "+num);	
			}
		}	
	}
}
