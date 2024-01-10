import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: calcular o valor de Y a partir de um valor X
 * Data: 11/09/2022
 */
public class questao7 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double x, quadrado, cubo;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Definir valor para x
		System.out.println("Insira um valor para 'X': ");
		x = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Condições para o valor de Y
		if (x <= 1) {
			System.out.println("y = 1");
		} else if (1 < x && x <= 2) {
			System.out.println("y = 2");
		} else if (2 < x && x <= 3) {
			quadrado = Math.pow(x, 2);
			System.out.println("y = " + quadrado);
		} else {
			cubo = Math.pow(x, 3);
			System.out.println("y = " + cubo);
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
