import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Calcular: o preço do killowatt, o valor a ser pago e o novo valor com 10% de desconto de uma conta de luz, a partir do valor do salário mínimo
 * Data:31/08/2022
 */
public class questao2 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		double valorSalMin, quantKW, valorKW, valorSemDesc, desconto, valorComDesc;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o valor do salário mínimo
		System.out.println("Digite o valor do salário mínimo");
		valorSalMin = teclado.nextDouble();

		// Receber a quantidade de kilowatt consumida
		System.out.println("Insira a quantidade de kilowatt consumida por uma residência ");
		quantKW = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular o valor do kilowatt
		valorKW = ((valorSalMin) / 7) / (100);

		// Calcular o valor a ser pago pela residência
		valorSemDesc = (valorKW * quantKW);

		// Calcular o valor a ser pago com 10% de desconto
		desconto = (valorSemDesc * 0.10);
		valorComDesc = (valorSemDesc - desconto);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Imprimir as informmações

		System.out.printf("Cada quilowatt tem o valor de R$: %.2f\n", valorKW);
		System.out.printf("O valor a ser pago na conta de energia dessa residência é de R$ %.2f\n ", valorSemDesc);
		System.out.printf("O valor a ser pago nessa conta de luz com desconto é de R$ %.2f", valorComDesc);

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
