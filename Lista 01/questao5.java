import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: Calcular e exibir diferentes aspectos financeiros de uma promoção em um hotel com base em informações fornecidas, incluindo a taxa de ocupação e o desconto na diária
 * Data: 10/09/2022
 */
public class questao5 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		double diaria, diariaPromocional, ocupacao80Percent, ocupacao50Percent, arrecadado80Percent,
				arrecadado50Percent, desconto, diferencaArrecadacao;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o valor da diária normal
		System.out.println("Insira o valor da diária do hotel:");
		diaria = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exibir as informações

		// Valor da diária promocional
		desconto = (diaria * 0.25);
		diariaPromocional = (diaria - desconto);
		System.out.println("A diária com desconto é no valor de R$: " + diariaPromocional);

		// Arrecadado com ocupação de 80% e diária promocional
		ocupacao80Percent = (0.80 * 75);
		arrecadado80Percent = ocupacao80Percent * diariaPromocional;
		System.out.println("O valor arrecadaDo pelo hotel com a capacidade de 80% e diária promocional é de R$: "
				+ arrecadado80Percent);

		// Arrecadado com oocupação de 50% e diária normal
		ocupacao50Percent = (0.50 * 75);
		arrecadado50Percent = ocupacao50Percent * diaria;
		System.out.println(
				"O valor arrecadado pelo hotel com a ocupação de 50% e diária normal é de R$: " + arrecadado50Percent);

		// Diferença entre as arrecadações
		diferencaArrecadacao = arrecadado80Percent - arrecadado50Percent;
		System.out.println("A diferença de arrecadação entre as ocupações e os valores das diárias é de R$: "
				+ diferencaArrecadacao);

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
