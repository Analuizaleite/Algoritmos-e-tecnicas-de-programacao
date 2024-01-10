import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: ler um valor N inteiro positivo. Calcule e escreva o valor de E (E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + .... + 1 / N!)
 * Data:15/09/2022
 */
public class questao4 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int n, fat = 1;
		double fracao, soma = 1;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Inserir um número para n
		System.out.println("Digite um valor para N:");
		n = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular fatorial

		if (n < 0) {
			System.out.println("O valor de N deve ser um inteiro positivo");
		} else {

			for (int i = 1; i <= n; i++) {
				fat = fat * i;

				// Calcular fração
				fracao = 1.0 / fat;

				// Calcular a soma
				soma = soma + fracao;

				System.out.println("Fração: " + fracao);
			}

			// ---------------------------------------------------------------------------------------//

			// ---------------------------------------------------------------------------------------//

			System.out.println("A soma das frações resulta em E = " + soma);

			// ---------------------------------------------------------------------------------------//

			teclado.close();

		}

	}
}
