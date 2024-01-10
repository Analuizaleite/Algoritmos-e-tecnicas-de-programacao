import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo:Receber votos de um candidato e contabilizá-los, assim como os nulos e em branco
 * Data: 15/09/2022
 */
public class questao10 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int voto = 1, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		//Incremento de votos até que 0 seja inserido
		while (voto != 0) {
			// Receber os votos
			System.out.println("Digite o seu voto e 0 para interromper a contagem:");
			voto = teclado.nextInt();
			if (voto == 1) {
				candidato1++;
			} else if (voto == 2) {
				candidato2++;
			} else if (voto == 3) {
				candidato3++;
			} else if (voto == 4) {
				candidato4++;
			} else if (voto == 5) {
				nulo++;
			} else {
				branco++;
			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		//Exibir os resultados
		System.out.println("Total de votos para candidato 1 é: " + candidato1);
		System.out.println("Total de votos para candidato 2 é: " + candidato2);
		System.out.println("Total de votos para candidato 3 é: " + candidato3);
		System.out.println("Total de votos para candidato 4 é: " + candidato4);
		System.out.println("Total de votos nulos é: " + nulo);
		System.out.println("Total de votos brancos é: " + branco);

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
