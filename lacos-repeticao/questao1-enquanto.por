programa
{
	
	funcao inicio()
	{
		real num, media = 0.0, total=0.0 , contador=0.0
	
		escreva("Insira um número: ")
		leia(num)

		enquanto (num >= 0)
	{
		contador += num
		total++	
		escreva("Insira um valor: ")
		leia(num)
	}
		media = contador/total
		escreva("O total da contagem foi de: ", total)
		escreva("\nA média foi de: ", media)
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */