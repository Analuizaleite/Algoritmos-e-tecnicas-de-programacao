import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Calcular o perímetro e área de um círculo
 * Data:31/08/2022
 */
public class questao4 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double raio, perimetro, area;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Valor para o raio
		System.out.println("Insira o valor para o raio do círculo");
		raio = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular o perímetro
		perimetro = (2 * Math.PI * raio);

		// Calcular a área
		area = (Math.PI * Math.pow(raio, 2));

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Apresentar os resutados
		System.out.printf("O perímetro do círculo será de %.2f\n", perimetro);
		System.out.printf("O valor da área do círculo será de %.2f", area);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}

}
