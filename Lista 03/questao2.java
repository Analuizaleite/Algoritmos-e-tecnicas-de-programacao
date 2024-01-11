import java.util.Scanner;

/*Objetivo: fazer um procedimento para ler os dados, calcular e exibir a média de salário de um população a partir os salários e o número de filhos dos habitantes
 * Autor: Ana Luíza Gonçalves Leite
 * Data:04/10/2022  
 */
public class questao2 {

	// ---------------------------------------------------------------------------------------//

	public static void pesquisaPopulacional() {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		double salario, salarioPopulacao = 0;
		int filhos = 0, habitantes = 0;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Ler os salários e número de filhos
		do {
			System.out.println(
					"Digite o seu salário. Insira um salário negativo para encerrar");
			salario = teclado.nextDouble();

			if (salario > 0) {
				salarioPopulacao += salario;

				System.out.println("Insira a quantidade de filhos: ");
				filhos += teclado.nextInt();
				habitantes++;
			}

		} while (salario > 0);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir o resultado
		System.out.println("A média de salário da população é de: " + (salarioPopulacao / (filhos + habitantes)));

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		pesquisaPopulacional();
	}

}
