import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: Receber o antigo salário e calcular seu novo salário de acordo com a opção escolhida
 * Data: 11/09/2022
 */
public class questao8 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double salarioAtual, novoSalario;
		char opcao;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o salário atual
		System.out.println("Insira  o salário atual do funcionário");
		salarioAtual = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Opções de aumento
		System.out.println("Insira a letra desejada de acordo com o cálculo do aumento a ser feito: ");
		System.out.println("A = aumento de 8% no salário");
		System.out.println("B = aumento de 11% no salário");
		System.out.println("C = aumento  fixo no salário");
		opcao = teclado.next().charAt(0);

		// Cálculo do aumento
		switch (opcao) {
			case 'A':
				novoSalario = (salarioAtual + (salarioAtual * 0.08));
				System.out.println("O novo salário será de: " + novoSalario);
				break;
			case 'B':
				novoSalario = (salarioAtual + (salarioAtual * 0.11));
				System.out.println("O novo salário será de: " + novoSalario);
				break;
			case 'C':
				if (salarioAtual <= 1000) {
					novoSalario = (salarioAtual + 350);
					System.out.println("O novo salário será de: " + novoSalario);
				} else {
					novoSalario = (salarioAtual + 200);
					System.out.println("O novo salário será de: " + novoSalario);
				}
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
