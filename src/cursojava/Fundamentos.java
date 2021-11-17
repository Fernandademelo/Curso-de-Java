package cursojava;

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
	 System.out.println("Exemplo 2 Uso do if else");
	 if ( idade < 18 ) {
		 System.out.println("Menor de Idade");
	 } else 
		 System.out.println("Maior de Idade");
	 
	}

}
