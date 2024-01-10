import java.util.Scanner;

// /*Autora:  Ana Luíza Gonçalves Leite
//  * Objetivo: Descobrir os dados desejados pela prefeitura a partir do salário e número de filhos de cada habitante.
//  * Data: 15/09/2022
//  */

public class questao5 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double salario = 0, totalSalarios = 0, salarioAte100 = 0, maiorSalario = 0;
		int populacao = 0, numFilhos = 0;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o salário
		System.out.println("Digite os salários dos habitantes ou um número negativo para parar a contagem:");
		salario = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Estrutura de repetição equanto os salário inserido for maior ou igual a zero
		while (salario >= 0) {

			// Incremento da populacao assalariada, do total de salários e número de filhos
			populacao++;
			totalSalarios += salario;

			System.out.println("Digite o número de filhos:");
			numFilhos += teclado.nextInt();

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario <= 100) {
				salarioAte100++;
			}

			System.out.println("Digite o próximo salário ou um número negativo para encerrar:");
			salario = teclado.nextDouble();
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir resultados
		if (populacao > 0) {
			System.out.println("A média salarial é de R$" + (totalSalarios / populacao));
			System.out.println("A média do número de filhos é: " + (numFilhos / populacao));
			System.out.println("Percentual com salário de até R$100: " + (salarioAte100 * 100 / populacao) + "%");
		} else {
			System.out.println("Nenhum dado válido foi inserido.");
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
