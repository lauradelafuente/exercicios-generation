programa
{
	
	funcao inicio()
	{
		inteiro teste[5],nota,maiornota=0

		para(nota=0;nota<5;nota++)
		{
			escreva("\nInsira uma nota: ")
			leia(teste[nota])
			escreva("Nota do aluno ", nota+1,": ",teste[nota],"\n")
			se (maiornota<teste[nota])
			maiornota=teste[nota]
		}
		
		escreva("\nA maior nota foi: ", maiornota)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {teste, 6, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */