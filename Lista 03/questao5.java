import java.util.Scanner;

/* 
 * Autora: Ana Luíza Gonçalves Leite
 * Objetivo: procedimento  que  recebe  a  média  final  de  um  aluno,  identifica  e  exibe  o  seu conceito
 * Data: 04/10/2022
 */
public class questao5 {

	// ---------------------------------------------------------------------------------------//

	//Procedimento que recebe a média por parâmetro e verifica em qual conceito ela se encaixa de acordo com as condições
	public static void conceito(double media) {
		
		if (media <= 39) {
			System.out.println("Conceito F");
		} else if (media >= 40 && media <= 59) {
			System.out.println("Conceito E");
		} else if (media >= 60 && media <= 69) {
			System.out.println("Conceito D");
		} else if (media >= 70 && media <= 79) {
			System.out.println("Conceito C");
		} else if (media >= 80 && media <= 89) {
			System.out.println("Conceito B");
		} else {
			System.out.println("Conceito A");
		}
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double media;
		int n;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber valor de N
		System.out.println("Insira um valor para N");
		n = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		//Estrutura de repetição para receber as médias finais enquanto existirem alunos. Faz a chamada do método a cada repetição para determinar a média
		for (int i = 0; i < n; i++) {
			// Receber a média
			System.out.println("Digite a média final de um aluno");
			media = teclado.nextDouble();

			//Chamada do procedimento passando a média por parâmetro
			conceito(media);

		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}