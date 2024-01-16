import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: preencher uma matriz 4x4, apresentar os elementos da soma abaixo da diagonal principal e os elementos da própria diagonal principal
 * Autor: Ana Luíza Gonçalves Leite
 * Data: 28/10/2022
 */
public class questao6 {
	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int soma = 0;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Preencher a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Insira um número para preencher");
				matriz[i][j] = teclado.nextInt();
			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcula a soma dos elementos abaixo da diagonal principal
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (i > j) {
					soma += matriz[i][j];
				}

			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir resultados
		System.out.println("A soma dos números abaixo da diagonal principal é: " + soma);

		System.out.println("Os elementos da diagonal principal são: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
