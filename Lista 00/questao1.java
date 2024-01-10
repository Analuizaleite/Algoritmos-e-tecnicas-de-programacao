import java.util.Scanner;

/*Autora: Ana Luíza  Gonçalves Leite
 * Objetivo: Converter um número de DCU para UDC
 * Data: 31/08/2022
 */
public class questao1 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int numero, centenas, dezenas, unidades, resto, invertido;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Número na ordem direta
		System.out.println("Insira o número que deseja converter");
		numero = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Trocando a ordem
		centenas = numero / 100;
		resto = numero % 100;
		dezenas = resto / 10;
		unidades = resto % 10;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Número no sistema UDC
		invertido = (unidades * 100) + (dezenas * 10) + centenas;
		System.out.println("O número invertido é: " + invertido);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
