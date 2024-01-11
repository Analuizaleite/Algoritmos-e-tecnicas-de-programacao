import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Escrever uma função que receba um valor por parâmetro e retorne o valor S segundo a fórmula: S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... +(n2+1)/(n+3)
 * Data: 05/10/2022
 */
public class questao8 {
	public static double calcularSoma(int N) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variável
		double s = 0;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Valor de S
		for (int i = 1; i <= N; i++) {
			s += (Math.pow(i, 2) + 1.0) / (i + 3.0);
		}

		// ---------------------------------------------------------------------------------------//

		//Retorno do valor final de S
		return (s);
	}

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int N;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber N
		System.out.println("Insira um valor para N");
		N = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		//Chamada da função passando N por parâmetro e exibindo o valor final de S
		System.out.println("A soma é:" + calcularSoma(N));

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
