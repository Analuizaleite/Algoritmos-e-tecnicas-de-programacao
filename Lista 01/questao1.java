import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Receber dois números e imprimir apenas o maior deles
 * Data:09/09/2022
 */
public class questao1 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		double num1, num2;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber dois números
		System.out.println("Digite o primeiro número:");
		num1 = teclado.nextDouble();
		System.out.println("Digite o segundo número:");
		num2 = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Imprimir somente o maior
		if (num1 == num2) {
			System.out.println("Os números são iguais");
		} else if (num1 > num2) {
			System.out.println("O maior número é " + num1);
		} else {
			System.out.println("O maior número é " + num2);
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
