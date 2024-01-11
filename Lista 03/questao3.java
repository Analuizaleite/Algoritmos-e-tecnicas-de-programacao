import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: procedimento que recebe 3 valores inteiros por parâmetro e os  exiba em ordem crescente
 * Data: 04/10/2022
 */
public class questao3 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento que compara os valores e os exibe em ordem crescente
	public static void ordemCrescente(int valor1, int valor2, int valor3) {

		if (valor1 < valor2 && valor1 < valor3) {
			if (valor2 < valor3) {
				System.out.println("A ordem  crescente é: " + valor1 + "-" + valor2 + "-" + valor3);
			} else if (valor3 < valor2) {
				System.out.println("A ordem crescente é:" + valor1 + "-" + valor3 + "-" + valor2);
			}
		} else if (valor2 < valor1 && valor2 < valor3) {
			if (valor1 < valor3) {
				System.out.println("A ordem crescente é:" + valor2 + "-" + valor1 + "-" + valor3);
			} else if (valor3 < valor1) {
				System.out.println("A ordem crescente é: " + valor2 + "-" + valor3 + "-" + valor1);
			}
		} else {
			if (valor1 < valor2) {
				System.out.println("A ordem crescente é: " + valor3 + "-" + valor1 + "-" + valor2);
			} else if (valor2 < valor1) {
				System.out.println("A ordem crescente é: " + valor3 + "-" + valor2 + "-" + valor1);
			}
		}
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, valor3, n;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Valor para N
		System.out.println("Digite um valor para N:");
		n = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Estrutura de repetição para receber os valores e fazer a chamada do
		// procedimento a cada loop
		for (int i = 0; i < n; i++) {

			System.out.println("Digite um valor inteiro para 1:");
			valor1 = teclado.nextInt();
			System.out.println("Digite um valor inteiro para 2:");
			valor2 = teclado.nextInt();
			System.out.println("Digite um valor inteiro para 3:");
			valor3 = teclado.nextInt();

			// Chamada do procedimento passando os valores por parâmetro
			ordemCrescente(valor1, valor2, valor3);
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}