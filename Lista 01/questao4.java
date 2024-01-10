import java.util.Scanner;

/* Autor: Ana Luíza Gonçalves Leite
 * Objetivo: Receber uma nota, verificar em qual descrição ela se encaixa e mostrar a mensagem correspondente
 * Data: 10/09/2022
 */
public class questao4 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double nota;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber a nota
		System.out.println("Insira a nota");
		nota = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Verificar em qual condição ela se encontra e apresentar a mensagem
		if (nota >= 8 && nota <= 10) {
			System.out.println("Ótimo");
		} else if (nota >= 7 && nota < 8) {
			System.out.println("Bom");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Regular");
		} else {
			System.out.println("Insatisfatório");
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
