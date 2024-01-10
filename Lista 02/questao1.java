import java.util.Scanner;
/* Autor: Ana Luíza Gonçalves Leite
 * Objetivo: ler uma sequencia de valores inteiros em uma linha de entrada e contar o número de valores positivos,negativos e zeros.
 * Data:15/09/2022
 */

public class questao1 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int positivo = 0, negativo = 0, nulo = 0, quantidade, numeros;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Quantidade de números
		System.out.println("Indique quantos números terá a sequência:");
		quantidade = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Ler os números
		System.out.println("Insira a sequência de números:");
		for (int i = 0; i < quantidade; i++) {
			numeros = teclado.nextInt();
			if (numeros > 0) {
				positivo++;
			} else if (numeros < 0) {
				negativo++;
			} else {
				nulo++;
			}
		}
		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir o resultado
		System.out.println("A quantidade de números positivos é: " + positivo);
		System.out.println("A quantidade de números negativos é: " + negativo);
		System.out.println("A quantidade de números nulos é: " + nulo);

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
