import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: armazenar em um vetor de 31 posições; calcular e imprimir: 
 * a maior e menor temperatura; a temperatura média ; número de dias nas quais a temperaura foi inferior a temperatura média
 * Data: 25/10/2022
 */
public class questao4 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int temperatura[] = new int[8], media = 0, soma = 0, inferior = 0;
		int maiorTemp = 0, menorTemp = Integer.MAX_VALUE;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		//Preencher o vetor com as temperaturas de Janeiro
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Insira um valor para a temperatura no "+(i+1)+"° dia de Janeiro");
			temperatura[i] = teclado.nextInt();

			if (temperatura[i] > 15 && temperatura[i] < 40) {
				soma += temperatura[i];
			} else {
				System.out.println("Insira uma temperatura maior que 15° e menor que 40°");
				i--;
			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Encontrar a maior e a menor temperatura
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > maiorTemp) {
				maiorTemp = temperatura[i];
			}
			if (temperatura[i] < menorTemp) {
				menorTemp = temperatura[i];
			}
		}

		// ---------------------------------------------------------------------------------------//

		//Encontrar a temperatura média
		media = soma / temperatura.length;

		//Contar quantos dias tiveram temperatura abaixo da média
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] < media) {
				inferior++;
			}
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		//Exibir resultados
		System.out.println("A maior temperatura é: " + maiorTemp + "°C");
		System.out.println("A menor temperatura é: " + menorTemp + "°C");
		System.out.println("A temperatura média é de: " + media + "°C");
		System.out.println("O número de dias em que a temperatura foi inferior a temperatura média é de: " + inferior);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
