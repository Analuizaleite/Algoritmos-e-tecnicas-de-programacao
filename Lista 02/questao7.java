import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Imprimir  os L primeiros elementos da série de Fibonacci
 * Data: 15/09/2022
 */
public class questao7 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis

		int n, f1 = 0, f2 = 1, f;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Inserir número de n
		System.out.println("Insira o número desejado de vezes para a repetição");
		n = teclado.nextInt();
		System.out.println("1° termo: " + f1);
		System.out.println("2° termo: " + f2);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular o Fibonacci e exibir os  até o número indicado

		for (int i = 3; i <= n; i++) {
			f = (f1 + f2);
			f1 = f2;
			f2 = f;

			System.out.println(i + "° termo: " + f);
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
