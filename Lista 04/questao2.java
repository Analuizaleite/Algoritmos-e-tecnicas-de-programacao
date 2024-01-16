import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: fazer um procedimento que preencha um vetor de 10 elementos, 
 * uma função que receba o vetor preenchido e passar os valores negativos para um novo vetor e 
 * retorná-lo como resultado. Fazer um procedimento que receba e exiba o conteúdo do vetor.
 * Data:27/10/2022
 */
public class questao2 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento para preencher o vetor
	public static void preencher(int vetor[]) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira valores positivos e negativos para preencher o  vetor");
			vetor[i] = teclado.nextInt();
		}
		teclado.close();
	}

	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Função que conta a quantidade de números negativos e os armazena em um novo
	// vetor
	public static int[] valNegativos(int vetor[]) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int negativo = 0, cont = 0;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Contar quantos negativos foram inseridos
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				negativo++;
			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Copiar os valores para um novo vetor
		int vetNegativo[] = new int[negativo];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				vetNegativo[cont] = vetor[i];
				cont++;
			}
		}

		// ---------------------------------------------------------------------------------------//

		// Retornar o resultado
		return (vetNegativo);
	}

	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento recebendo e mostrando o conteúdo do vetor
	public static void exibe(int vetNegativo[]) {

		if (vetNegativo.length > 0) {
			for (int i = 0; i < vetNegativo.length; i++) {
				System.out.println("Vetor negativo: " + vetNegativo[i]);
			}
		} else {
			System.out.println("Não possui números negativos");
		}

	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração do vetor
		int vetor[] = new int[10];

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada dos módulos
		preencher(vetor);
		int x[] = valNegativos(vetor);
		exibe(x);

		// ---------------------------------------------------------------------------------------//

	}
}
