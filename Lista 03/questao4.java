import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: procedimento que recebe os 3 valores dos lados e identifica se é um triângulo. Caso for, de que tipo é
 * Data: 04/10/2022
 */
public class questao4 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento que verifica se os lados correspondem aos de um triângulo
	public static void triangulo(double X, double Y, double Z) {

		// Verifica se é um triângulo
		if (X > 0 && Y > 0 && Z > 0 && (X + Y > Z) && (X + Z > Y) && (Y + Z > X)) {
			System.out.println("É um triângulo");

			// Verifica o tipo de triângulo
			if (X == Y && Y == Z) {
				System.out.println("Triângulo do tipo equilátero");
			} else if (X == Y || Y == Z || X == Z) {
				System.out.println("Triângulo do tipo isósceles");
			} else {
				System.out.println("Triângulo do tipo escaleno");
			}
		} else {
			System.out.println("Não é um triângulo");
		}
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double X, Y, Z;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Recebe o tamanho dos três lados e faz a chamada do procedimento passando-os por parâmetro
		do {

			System.out.println("Digite um valor para o primeiro lado");
			X = teclado.nextDouble();

			if (X > 0) {
				System.out.println("Digite um  valor para o segundo lado");
				Y = teclado.nextDouble();
				System.out.println("Digite um valor para o terceiro lado");
				Z = teclado.nextDouble();

				// Chamada do procedimento
				triangulo(X, Y, Z);
			} else {
				System.out.println("Número inválido ");
			}

		} while (X > 0);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}