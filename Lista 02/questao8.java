import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: Imprimir números da série Fibonacci menores que L
 * Data: 15/09/2022
 */
public class questao8 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int n, f1 = 0, f2 = 1, f;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Inserir número de n
		System.out.println("Insira o número desejado  de vezes para a repetição");
		n = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular o Fibonacci e exibir os menores que o número indicado
		System.out.println("Números da série Fibonacci menores que " + n + ":");

		while (f1 < n) {

			System.out.println(f1 + " ");

			f = (f1 + f2);
			f1 = f2;
			f2 = f;

		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
