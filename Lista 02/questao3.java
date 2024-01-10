import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: verifica se 10 números são divisíveis por 3 e 9 simultaneamente, por 2 e por 5 individualmente, mostrando se algum número não é divisível e contando quantos números são divisíveis por cada conjunto de divisores.
 * Data:15/09/2022
 */
public class questao3 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int numero, divisivel3_9 = 0, divisivel2 = 0, divisivel5 = 0;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber os números

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite o " + (i + 1) + "º número");
			numero = teclado.nextInt();

			// Divisível por 3 e 9
			if ((numero % 3 == 0) && (numero % 9 == 0)) {
				divisivel3_9++;
			} else if (numero % 2 == 0) { // Divisível por 2
				divisivel2++;
			} else if (numero % 5 == 0) { // Divisivel por 5
				divisivel5++;
			} else { // Não divisível por nenhum dos valores
				System.out.println("Número não é divisível pelos valores");
			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Quantidade dos números que podem ser divididos
		System.out.println("Podem ser divididos " + divisivel3_9 + " números por 3 e 9");
		System.out.println("Podem ser divididos " + divisivel2 + " números por 2");
		System.out.println("Podem ser divididos " + divisivel5 + " números por 5");

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}

}
