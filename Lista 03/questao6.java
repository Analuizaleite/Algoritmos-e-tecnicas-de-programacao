import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: escrever uma função que recebe um valor por parâmetro e retorna o valor de S segundo a fórmula: S = 1 + 1/1! + 1/2! + 1/3! + ...+1 /N!
 * Data:05/10/2022
 */
public class questao6 {
	public static double calcularS(int N) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		int fat = 1;
		double fracao, S = 1;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Cálculo de S
		for (int i = 1; i <= N; i++) {
			fat = fat * i;
			fracao = 1.0 / fat;
			S = S + fracao;
		}

		// ---------------------------------------------------------------------------------------//

		//Retorno do valor S
		return S;
	}

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int N;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber valor de N
		System.out.println("Insira um valor para N");
		N = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir valor final de S
		System.out.println("O valor de S será: " + calcularS(N));

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}