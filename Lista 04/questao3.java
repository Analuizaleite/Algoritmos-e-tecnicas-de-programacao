import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: preencher dois vetores de 10 elementos em um procedimento.
 * Em outro procedimento, receber os dois vetoree e gerar um novo com os elementos intercalados,
 * nas posições ímpares os elementos do primeiro vetor e nas pares os do segundo 
 * Data:27/10/2022
 */
public class questao3 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento que recebe dois vetores por parâmetro e os preenche
	public static void preencherVetores(int vetor1[], int vetor2[]) {
		Scanner teclado = new Scanner(System.in);

		// preencher X
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Insira um valor para X");
			vetor1[i] = teclado.nextInt();
		}

		// preencher Y
		for (int j = 0; j < vetor2.length; j++) {
			System.out.println("Insira um valor para Y");
			vetor2[j] = teclado.nextInt();
		}

		// Chamada do procedimento
		par_impar(vetor1, vetor2);
		teclado.close();
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento que gera um vetor com as posições intercaladas entre pares e
	// ímpares
	public static void par_impar(int vetor1[], int vetor2[]) {

		// ---------------------------------------------------------------------------------------//

		// Declaração do vetor
		int vetorIntercalado[] = new int[20];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Inserindo nas posições ímpares, os elementos do primeiro vetor
		int c = 0;
		for (int i = 1; i < vetorIntercalado.length; i += 2) {
			vetorIntercalado[i] = vetor1[c];
			c++;
		}

		// Inserindo nas posições pares, os elementos do segundo vetor
		c = 0;
		for (int i = 0; i < vetorIntercalado.length; i += 2) {
			vetorIntercalado[i] = vetor2[c];
			c++;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibe o vetor intercalado
		System.out.print("[ ");
		for (int k = 0; k < vetorIntercalado.length; k++) {
			System.out.print(vetorIntercalado[k] + " ");
		}
		System.out.print("]");

		// ---------------------------------------------------------------------------------------//

	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração dos vetores
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada do procedimenro
		preencherVetores(vetor1, vetor2);

		// ---------------------------------------------------------------------------------------//

	}
	// ---------------------------------------------------------------------------------------//
}
