import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: analisar o desempenho financeiro de mercadorias, categorizando-as com base nos lucros obtidos (menor que 10%, entre 10% e 20%, ou maior que 20%).Fornecer o valor total de compra, venda e o lucro global. 
 * Data:15/09/2022
 */
public class questao9 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		double compra = 1, venda = 0, lucro, lucroTotal = 0, vendaTotal = 0, compraTotal = 0;
		int lucro10 = 0, lucro20 = 0, lucroEntre10_20 = 0;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		System.out.println("Insira o preço de compra da mercadoria e 0 para interromper a contagem: ");
		compra = teclado.nextDouble();

		while (compra != 0) {
			// Preço das mercadorias
			// compra = teclado.nextDouble();
			System.out.println("Insira o preço de venda da mercadoria e 0 para interromper a contagem:");
			venda = teclado.nextDouble();

			lucro = venda - compra;
			if (lucro < (venda * 0.10)) { // I)lucro<10%
				lucro10++;
			} else if (lucro >= (0.10 * venda) && lucro <= (0.20 * venda)) {// II)10%<=lucro<=20%
				lucroEntre10_20++;
			} else {// III)lucro>20%
				lucro20++;
			}

			// Incremento dos valores totais
			lucroTotal += lucro;
			vendaTotal += venda;
			compraTotal += compra;

			System.out.println("Insira o preço de compra da mercadoria e 0 para interromper a contagem: ");
			compra = teclado.nextDouble();
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Exbir resultados
		System.out.println("O total de mercadorias que apresentam lucro menor que 10% é: " + lucro10);
		System.out.println("O total de mercadorias que apresentam lucro entre 10% e 20% é: " + lucroEntre10_20);
		System.out.println("O total de mercadorias que apresentam lucro maior que 20% é: " + lucro20);
		System.out.println("O valor total de compra de todas as mercadorias é R$ " + compraTotal);
		System.out.println("O valor total de venda de todas as mercadorias é R$ " + vendaTotal);
		System.out.println("O lucro total é de R$: " + lucroTotal);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
