import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: fazer um procedimento que preencha uma matriz e uma função para cada soma a ser realizada:
 *  linha 4 de M, coluna 2 de M, diagonal principal, diagonal secundária e de todos os elementos.
 * Data:27/10/2022
 */
public class questao5 {

	// ---------------------------------------------------------------------------------------//

	// Calcular a soma da linha 4
	public static int somaLinha4(int matriz[][]) {

		int somaLinhas = 0;

		for (int i = 0; i < matriz.length; i++) {
			somaLinhas += matriz[4][i];
		}

		return (somaLinhas);
	}

	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Calcular a soma da coluna 2
	public static int somaColuna2(int matriz[][]) {

		int somaColunas = 0;

		for (int i = 0; i < matriz.length; i++) {
			somaColunas += matriz[i][2];
		}
		return (somaColunas);
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Calcular a soma da diagonal principal
	public static int somaDiagonalPrincipal(int matriz[][]) {

		int somaDiagonal = 0;

		for (int i = 0; i < matriz.length; i++) {
			somaDiagonal += matriz[i][i];
		}
		return (somaDiagonal);
	}

	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Calcular a soma da diagonal secundaria
	public static int somaDiagonalSecundaria(int matriz[][]) {

		int somaSecundaria = 0;

		for (int j = 4, i = 0; j >= 0; i++, j--) {
			somaSecundaria += matriz[i][j];
		}

		return (somaSecundaria);
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Calcular a soma de todos os elementos da matriz
	public static int todos(int matriz[][]) {

		int somaTodos = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				somaTodos += matriz[i][j];
			}
		}
		return (somaTodos);
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento para preencher a matriz
	public static void preencherMatriz(int matriz[][]) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Insira os valores:");
				matriz[i][j] = teclado.nextInt();
			}
		}

		teclado.close();
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração da matriz
		int matriz[][] = new int[5][5];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada do procedimento
		preencherMatriz(matriz);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir resultados com os valores retornados das chamadas das funções
		System.out.println("A soma da linha 4 é " + somaLinha4(matriz));
		System.out.println("A soma da coluna 2 é " + somaColuna2(matriz));
		System.out.println("A soma da diagonal principal é " + somaDiagonalPrincipal(matriz));
		System.out.println("A soma da diagonal secundária é " + somaDiagonalSecundaria(matriz));
		System.out.println("A soma de todos os elementos da matriz é " + todos(matriz));

		// ---------------------------------------------------------------------------------------//

	}
	// ---------------------------------------------------------------------------------------//
}
