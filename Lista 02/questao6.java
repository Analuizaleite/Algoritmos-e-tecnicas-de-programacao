import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: ler um valor n inteiro e calcular a soma (S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n) escrevendo cada termo gerado e o valor final de S
 * Data:15/09/2022
 */
public class questao6 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int n;
		double soma = 1, i, s = 0;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Valor para n
		System.out.println("Digite um valor para n");
		n = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Soma
		for (i = 1; i <= n; i++) {
			soma = (1.0 / i);
			System.out.println("Valor gerado: " + soma);
			s += soma;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Valor final de S
		System.out.println("O valor final  de S é " + s);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
