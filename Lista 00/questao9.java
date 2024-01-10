import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Transformar divisões fracionárias em resultados decimais
 * Data:31/08/2022
 */
public class questao9 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double decimal,numerador, denominador;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o valor para numerador
		System.out.println("Insira o valor para o numerador:");
		numerador = teclado.nextDouble();

		// Receber o valor para o denominador
		System.out.println("Insira o valor para o denominador:");
		denominador = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//
		// Tranformar em número decimal
		decimal = (numerador / denominador);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Apresentar o resultado final
		System.out.println("A fração "+numerador+"/"+denominador+ " corresponde a " +decimal+ " em decimal");

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
