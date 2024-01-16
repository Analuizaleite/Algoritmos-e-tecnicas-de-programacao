import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo:fazer um procedimento que preencha duas matrizes 4x6. 
 * Fazer uma função que receba as duas matrizes e que calcule a soma em uma nova matriz. 
 * Fazer uma função que calcule a diferença em uma nova matriz. 
 * Data: 28/10/2022
 */
public class questao7 {

	// ---------------------------------------------------------------------------------------//

	// Função que calcula a soma das duas matrizes
	public static int[][] somarMatrizes(int matriz1[][], int matriz2[][]) {

		int somaMatrizes[][] = new int[4][6];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return (somaMatrizes);
	}

	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Função que calcula a diferença das duas matrizes
	public static int[][] subtrairMatrizes(int matriz1[][], int matriz2[][]) {

		int subtracaoMatrizes[][] = new int[4][6];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				subtracaoMatrizes[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
		return (subtracaoMatrizes);
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento para preencher as matrizes
	public static void preencherMatrizes(int matrizA[][], int matrizB[][]) {

		Scanner teclado = new Scanner(System.in);

		// Matriz A
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				System.out.println("Insira os valores para a matriz A");
				matrizA[i][j] = teclado.nextInt();
			}

		}

		// Matriz B
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				System.out.println("Insira os valores para a matriz B");
				matrizB[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de matrizes
		int matrizA[][] = new int[4][6];
		int matrizB[][] = new int[4][6];
		int matrizSoma[][] = new int[4][6];
		int matrizSubtracao[][] = new int[4][6];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada do procedimento e funções
		preencherMatrizes(matrizA, matrizB);
		matrizSoma = somarMatrizes(matrizA, matrizB);
		matrizSubtracao = subtrairMatrizes(matrizA, matrizB);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir resultados

		System.out.println("O resultado da soma das matrizes é: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				System.out.print(matrizSoma[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("O resultado da subtração das matrizes é: ");

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				System.out.print(matrizSubtracao[i][j] + " ");
			}
			System.out.println();
		}

		// ---------------------------------------------------------------------------------------//

	}
	// ---------------------------------------------------------------------------------------//
}
