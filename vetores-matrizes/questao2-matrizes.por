programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3],linha,coluna, somatot=0, somad=0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("Insira um valor: ")
				leia(mat[linha][coluna])

				somatot+=mat[linha][coluna]
				somad=mat[0][0]+mat[1][1]+mat[2][2]
			}
		}
		escreva("Soma dos valores matriz: ",somatot)
		escreva("\nSoma dos valores diagonal: ",somad)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */