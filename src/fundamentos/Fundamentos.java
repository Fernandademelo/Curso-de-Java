package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 29;
		char sexo = 'F';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		nome = "Fernanda";
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println("_____________________________________");
		System.out.println("");

		//	 OPERADORES ARITMETICOS
		double i = 10;
		System.out.println("Operadores Aritmeticos e Atribuições");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i =" + i + " + 5 | i = " + (i+5));
		System.out.println("i =" + i + " - 5 | i = " + (i-5));
		System.out.println("i =" + i + " * 5 | i = " + (i*5));
		System.out.println("i =" + i + " / 5 | i = " + (i/5));
		System.out.println("i =" + i + " % 5 | i = " + (i%5));
		//	 ATRIBUICOES
		System.out.println("i += 5         |  i = " + (i+=5));
		System.out.println("i -= 5         |  i = " + (i-=5));
		System.out.println("i *= 5         |  i = " + (i*=5));
		System.out.println("i /= 5         |  i = " + (i/=5));


		i++;
		System.out.println("i++             |" + (i));
		i--;
		System.out.println("i--             |" + (i));
		System.out.println("_____________________________________");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("Condicionais");
		System.out.println("Exemplo 1 Uso do if");
		if ( sexo == 'F' ) {
			System.out.println("Alistamento Militar Não Obrigatorio");
		}
		System.out.println("_____________________________________");
		System.out.println("Exemplo 2 Uso do if-else");
		System.out.println("");
		if ( idade < 18 ) {
			System.out.println("Menor de Idade");
		} else 
			System.out.println("Maior de Idade");
		System.out.println("_____________________________________");
		System.out.println("Exemplo 3 Uso do else-if");
		System.out.println("");
		if (idade < 16) {
			System.out.println("Proibido Votar");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto Obrigatorio");
		} else  {
			System.out.println("Voto Facultativo");
		}
//	o ultimo else podia ser if com essa sentença else if	(idade ==16  || idade ==17 ||  idade>70 )
		System.out.println("_____________________________________");
		System.out.println("Exemplo 4 - Uso do Switch Case");
		System.out.println("");
		System.out.println("1. Cadastro de Clientes");
		System.out.println("2. Cadastro de Usuarios");
		System.out.println("3. Relatorios");
		int opcao = 3;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUARIOS");
			break;
		case 3:
			System.out.println("RELATORIOS");
			break;
		default:
			System.out.println("OPCAO INVALIDA BB");
		}
	
		System.out.println("_____________________________________");
		System.out.println("ESTRUTURA DE REPETICOES");
		System.out.println("Exemplo 5 - Uso do for");
		System.out.println("");
//		j vale 10, ele vai executar ate j nao ser mais maior a 0.
		for ( int j=10; j>0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println(" Exemplo 6 - Tabuada");
		System.out.println("");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <=10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada*valor));
			}
		}
		System.out.println("");
		System.out.println(" Exemplo 7 - Uso while");
		int contador = 1;
		while (contador <=10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println(" Exemplo 8 - Uso  estrutura - do while");
		char novoJogo;
		do {
			System.out.println("Deseja Jogar novamente? (s/n)");
			novoJogo = 'n';
			} while (novoJogo == 's');
//		sai do loop pq while é falsa , sai do laço, senao fica dentro
		System.out.println("GAME OVER");
	
	
	
	}

}
