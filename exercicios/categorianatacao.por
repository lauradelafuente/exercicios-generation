programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia categoria

		escreva ("Insira sua idade: ")
		leia (idade)

		se (idade >= 5 e idade <= 7)
		{
			escreva ("Você é da categoria Infantil A.")
		}
		senao se (idade >= 8 e idade <= 11)
		{
			escreva ("Você é da categoria Infantil B")
		}
		senao se (idade >= 12 e idade <= 13)
		{
			escreva ("Você é da categoria Juvenil A")
		}
		senao se (idade >= 14 e idade <= 17)
		{
			escreva ("Você é da categoria Juvenil B")
		}
		senao se (idade >= 18)
		{
			escreva ("Você é da categoria Adulto")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */