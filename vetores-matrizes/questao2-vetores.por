programa
{
	
	funcao inicio()
	{
		inteiro dado[10], lanc, med=0, soma=0, maior=0,qntmaior=0

		para(lanc=0;lanc<10;lanc++)
		{
			escreva("Lançamento: ")
			leia(dado[lanc])

			soma=dado[lanc]+soma
			
			se(maior<dado[lanc])
			{
				maior=dado[lanc]
				qntmaior=1
			}
			senao se(maior==dado[lanc])
			{
				qntmaior++
			}
		}
		med=soma/10
		escreva("\nA media dos lançamentos foi: ",med)
		escreva("\nO maior dado foi: ",maior,"\nLançado ",qntmaior," vezes")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */