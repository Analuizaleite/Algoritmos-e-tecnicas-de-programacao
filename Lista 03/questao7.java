import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Criar uma função que recebe um número e com seu retorno, verificar se é positivo ou negativo
 * Data: 05/10/2022
 */
public class questao7 {

	// ---------------------------------------------------------------------------------------//

	//Função que recebe um número por parâmetro e retorna um valor boolean se ele é positivo ou negativo
	public static boolean verificacao(int n) {

		if (n > 0) {
			return (true);
		} else {
			return (false);
		}
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int y = 1;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Estrutura condicional que possui a chamada da função passando o número válido
		// por parâmetro e exibe se o número é positivo ou negativo

		while (y != 0) {
			System.out.println("Insira um número e 0 para interromper");
			y = teclado.nextInt();

			if (y != 0) {
				if (verificacao(y)) {
					System.out.println("O número é positivo");
				} else {
					System.out.println("O número é negativo");
				}
			}
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}