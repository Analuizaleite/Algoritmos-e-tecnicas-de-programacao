import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Transformar o programa anterior para calcular o percentual dos valores positivos,negativos e zeros em relação ao  total de valores fornecidos
 * Data:15/09/2022
 */
public class questao2 {

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

		System.out.println("A porcentagem de positivos é: " + (positivo * 100 / quantidade) + "%");
		System.out.println("A porcentagem de negativos é: " + (negativo * 100 / quantidade) + "%");
		System.out.println("A porcentagem de zeros é: " + (nulo * 100 / quantidade) + "%");

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}