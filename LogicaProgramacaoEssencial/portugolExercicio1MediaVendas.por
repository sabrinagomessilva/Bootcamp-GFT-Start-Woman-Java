programa
{
	
	funcao inicio()
	{
		real jan,fev,mar,abr,media, total
		cadeia vendedor
		

		escreva("Digite o nome do vendedor: ")
		leia(vendedor)
		escreva("Digite o valor de venda para o mês de janeiro: ")
		leia(jan)
		escreva("Digite o valor de venda para o mês de fevereiro: ")
		leia(fev)
		escreva("Digite o valor de venda para o mês de março: ")
		leia(mar)
		escreva("Digite o valor de venda para o mês de abril:  ")
		leia(abr)
		
		total = jan+fev+mar+abr
		media = total/4
		

		
		escreva("O vendedor: " + vendedor + " obteve a média: " + media + " de vendas")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */