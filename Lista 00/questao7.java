import java.util.Scanner;

/*Autora :Ana Luíza Gonçalves Leite
 * Objetivo: Ler a razão e o primeiro termo de uma progressão geométrica. Exibit o o quinto termo
 * Data:31/08/2022
 */
public class questao7 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double q, a1, a5;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber a razão da PG
		System.out.println("Insira o valor da razão da PG:");
		q = teclado.nextDouble();

		// Receber o primeiro termo da PG
		System.out.println("Insira o valor para o primeiro termo da PG:");
		a1 = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Cálculo da progressão geométrica para o 5 termo

		a5 = a1 * Math.pow(q, (5 - 1));
		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir o quinto termo
		System.out.printf("O quinto termo da progressão geométrica é %.2f:", a5);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}

}
