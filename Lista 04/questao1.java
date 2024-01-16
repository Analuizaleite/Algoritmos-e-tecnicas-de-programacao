import java.util.Scanner;

/* Autora:Ana Luíza Gonçalves Leite
 * Objetivo: fazer um procedimento que preenche um vetor com notas de 10 alunos. Outro procedimento que receba um vetor preenchido com as notas e calcula a média da turma e quantos alunos obtiveram a nota acima da média
 * Data: 25/10/2022
 */
public class questao1 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento que calcula a média dos alunos e a quantidade de alunos acima da
	// média. Exibe os resultados obtidos
	public static void media(double notas[]) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double somaNotas = 0, media = 0;
		int acima = 0;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// calcular a média das notas
		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}

		media = somaNotas / notas.length;
		System.out.println("A média da turma é: " + media);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// quantidade de alunos com nota acima da média
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				acima++;
			}
		}
		System.out.println("A quantidade de alunos cima da média é: " + acima);

		// ---------------------------------------------------------------------------------------//

	}

	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento para preencher as 10 notas
	public static void preencher(double notas[]) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Coloque o valor da nota do aluno");
			notas[i] = teclado.nextDouble();
		}

		teclado.close();

	}

	// ---------------------------------------------------------------------------------------//
	
	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração do vetor
		double notas[] = new double[10];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada dos procedimentos passando o vetor de notas por parâmetro
		preencher(notas);
		media(notas);

		// ---------------------------------------------------------------------------------------//

	}
}
