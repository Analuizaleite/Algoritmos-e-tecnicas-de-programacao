import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo:Ler a razão e o primeiro termo de uma PA. Exibir o décimo termo
 * Data:31/08/2022
 */
public class questao6 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double razao, a1, a10;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o valor da razão da PA
		System.out.println("Insira um valor para a razão da PA:");
		razao = teclado.nextDouble();

		// Receber o valor para o primeiro termo da PA
		System.out.println("Insira um valor para o primeiro valor da PA:");
		a1 = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular a progressão aritmética
		a10 = (a1 + (10 - 1) * razao);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Apresentar o décimo termo da PA
		System.out.printf("O décimo termo da PA será: %.2f", a10);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
