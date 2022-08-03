programa
{
	
	funcao inicio()
	{
		inteiro matn1[4][6],matn2[4][6],matm1[4][6],matm2[4][6],somam1=0,somam2=0,l,c

		para(l=0;l<4;l++)
		{	
			para(c=0;c<6;c++)
			{
				escreva("\nInsira um número para matn1: ")
				leia(matn1[l][c])
				
				escreva("\nInsira um número para matn2: ")
				leia(matn2[l][c])

				matm1 [l][c] = matn1[l][c] + matn2 [l][c]
				matm2 [l][c] = matn1[l][c] - matn2 [l][c]
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matn1, 6, 10, 5}-{matn2, 6, 22, 5}-{matm1, 6, 34, 5}-{matm2, 6, 46, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */