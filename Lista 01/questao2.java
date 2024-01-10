import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Receber dois números inteiros e fazer a adição. Em seguida, somar 7 se o resultado for menor que 10 e 5 se o resultado for maior que 10. Imprimir o resultado final
 * Data::09/09/2022
 */
public class questao2 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int num1, num2, soma, adicao1, adicao2;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber os números
		System.out.println("Insira um número inteiro");
		num1 = teclado.nextInt();
		System.out.println("Insira outro número inteiro");
		num2 = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular a soma
		soma = (num1 + num2);
		adicao1 = (soma + 5);
		adicao2 = (soma + 7);

		// ---------------------------------------------------------------------------------------//

		// Condicionais para imprimir o resultado final
		if (soma >= 10) {
			System.out.println("O resultado final da soma desses números com 5 é: " + adicao1);
		} else {
			System.out.println("O resultado final da soma desses números com 7 é: " + adicao2);
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
