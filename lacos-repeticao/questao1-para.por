programa
{
	
	funcao inicio()
	{
		real maiorsal=0.0, salario, nfilhos, somasal=0.0, somafilhos=0.0, hab,salmenor100=0.0, medsalario, medfilhos, percsal=0.0

		para(hab=1.0;hab<=20;hab++)
		{
			escreva("Insira seu salário: ")
			leia(salario)
			escreva("Insira a quantidade de filhos: ")
			leia(nfilhos)
			somasal+=salario
			somafilhos+=nfilhos
			se (salario>maiorsal)
			{
				maiorsal=salario
			}
			se (salario<=100)
			{
				salmenor100++
			}
		}
			medsalario = somasal/20
			medfilhos = somafilhos/20
			percsal = (salmenor100/20)*100

			escreva("\nMédia de salário foi de: ", medsalario)
			escreva("\nMédia de filhos é de:  ", medfilhos)
			escreva("\nPorcentagem de salários menores que 100 reias: ", salmenor100)
			escreva("\nMaior salário é de: ",maiorsal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 782; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */