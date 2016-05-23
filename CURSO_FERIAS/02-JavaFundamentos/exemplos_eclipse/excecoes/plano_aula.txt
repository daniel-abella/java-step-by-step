**********************************************************
Excecoes
**********************************************************

Exceções definidas como:
	* Situações indesejadas, que não deveriam acontecer
	  no fluxo normal do seu sistema.
	  Você vai querer sinalizar ao resto do sistema que isso
	  aconteceu.

Existem 2 tipos de exceções:

	*Checadas

		+ Deve ser tratada obrigatoriamente
		+ Deve ser filha de Exception ou qualquer de suas
		  subclasses, exceto RuntimeException
		+ Indicam quando uma condição necessária para o
		  correto funcionamento de um fluxo do sistema
		  não é satisfeita.

	*Não checadas 01
		+ O tratamento é opcional
		+ RuntimeException ou subclasses
		+ Lançada pela JVM
		+ Indicam geralmente bugs ou erros de programação
		  (condições não checadas ou previstas)

	*Não checadas 02
		+ O tratamento é opcional
		+ Lançadas pela JVM
		+ Representam erros na própria VM


As exceções são

- Definidas
	* Criar uma classe de exceção que estenda de Exception
	* Opcional
- Declaradas
	* Adicionar as exceções à assinatura de um método
- Lançadas
	* throw new MinhaExcecao()
	* throw e;
- Tratadas
	* try-catch-finally
