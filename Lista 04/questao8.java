import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: criar procedimentos que preencham e manipulem uma matriz 10X10. C
 * Cada procedimento realiza uma troca específica na matriz, como trocar a linha 2 com a linha 8, a coluna 4 com a coluna 10,
 * a diagonal principal com a diagonal secundária, e a linha 5 com a coluna 10, demonstrando o resultado final após cada operação.
 * Data:  01/11/2022
 */
public class questao8 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento que realiza a troca da linha 2 com a 8 e exibe a matriz com as trocas feitas
	public static void trocarLinhas_2_8(int matriz[][]) {

		int temp = 0;

		// ---------------------------------------------------------------------------------------//

		// Trocar linha 2 com linha 8
		for (int i = 0; i < matriz.length; i++) {
			temp = matriz[1][i];
			matriz[1][i] = matriz[7][i];
			matriz[7][i] = temp;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir a nova matriz
		System.out.println("Linha 2 com linha 8");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// ---------------------------------------------------------------------------------------//
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento que troca a coluna 4 com a 8 e exibe a matriz com as trocas feitas
	public static void trocarColunas_4_10(int matriz[][]) {

		int temp = 0;

		// ---------------------------------------------------------------------------------------//

		// Trocar coluna 4 com coluna 8
		for (int i = 0; i < matriz.length; i++) {
			temp = matriz[i][3];
			matriz[i][3] = matriz[i][9];
			matriz[i][9] = temp;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir a nova matriz
		System.out.println("Coluna 4 com a coluna 10");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		// ---------------------------------------------------------------------------------------//

	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento que troca a diaginal principal com a secundária e exibe a matriz com as trocas feitas
	public static void trocarDiagonais(int matriz[][]) {

		// ---------------------------------------------------------------------------------------//

		// Troca as duas diagonais
		for (int i = 0, j = 0, j1 = matriz.length - 1; i < matriz.length; i++, j++, j1--) {

			int temp = matriz[i][j];

			matriz[i][j] = matriz[i][j1];
			matriz[i][j1] = temp;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir a nova matriz
		System.out.println("Diagonais invertidas");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// ---------------------------------------------------------------------------------------//
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento que troca a linha 5 com a coluna 10 e exibe a matriz com as trocas feitas
	public static void trocarLinha5_coluna10(int matriz[][]) {

		// ---------------------------------------------------------------------------------------//

		// Troca a linha com a coluna
		for (int i = 0; i < matriz.length; i++) {

			int temp = matriz[4][i];
			matriz[4][i] = matriz[i][9];
			matriz[i][9] = temp;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibe a nova matriz
		System.out.println("Linha 5 com coluna 10");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// ---------------------------------------------------------------------------------------//
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento para preencher a matriz original e a exibe
	public static void preencherMatriz(int matriz[][]) {

		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		System.out.println("Preencha a matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				matriz[i][j] = teclado.nextInt();
			}
		}
		teclado.close();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir a matriz
		System.out.println("A matriz digitada foi: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		// ---------------------------------------------------------------------------------------//
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração da matriz
		int matriz[][] = new int[10][10];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada dos procedimentos passando a matriz preenchida por parâmetro
		preencherMatriz(matriz);
		trocarLinhas_2_8(matriz);
		trocarColunas_4_10(matriz);
		trocarDiagonais(matriz);
		trocarLinha5_coluna10(matriz);

		// ---------------------------------------------------------------------------------------//

	}
	// ---------------------------------------------------------------------------------------//
}
