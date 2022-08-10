// Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
//(d) Mostre na tela cada valor do vetor A, um em cada linha

package ExPlataforma;

public class ex1vetores {
	
	public static void main (String args[])
	{
		int [] A =  {1,0,5,-2,-5,7};
		int soma;
		
		soma = A[0]+A[1]+A[5];
		A[4]=100;
		
		System.out.println("O valor do vetor A0 é: "+A[0]);
		System.out.println("O valor do vetor A1 é: "+A[1]);
		System.out.println("O valor do vetor A2 é: "+A[2]);
		System.out.println("O valor do vetor A3 é: "+A[3]);
		System.out.println("O valor do vetor A4 é: "+A[4]);
		System.out.println("O valor do vetor A5 é: "+A[5]);
		System.out.println("A soma dos valores A0, A1 e A5 é de: "+soma);
	}

}
