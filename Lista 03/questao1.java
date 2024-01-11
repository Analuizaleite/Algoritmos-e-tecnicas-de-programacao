import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
*Objetivo: Receber 3 notas de um aluno e calcular a média aritmética ou ponderada
* Data:04/10/2022
*/
public class questao1 {

	// ---------------------------------------------------------------------------------------//

	// Procedimento que calcula e exibe a média aritmética ou ponderada
	public static void calcularMedia(double nota1, double nota2, double nota3, char letra) {

		switch (letra) {
			case 'A':
				System.out.println("A média aritmética das notas é: " + (nota1 + nota2 + nota3) / 3);
				break;
			case 'P':
				System.out
						.println("A média ponderada das notas é: " + (5 * nota1 + 3 * nota2 + 2 * nota3) / (5 + 3 + 2));
				break;
		}
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3;
		char letra;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber notas
		System.out.println("Digite três notas");
		nota1 = teclado.nextDouble();
		nota2 = teclado.nextDouble();
		nota3 = teclado.nextDouble();
		System.out.println("Digite letra 'A'  ou 'P' ");
		letra = teclado.next().charAt(0);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada do procedimento passando as notas e a opção desejada por parâmetro
		calcularMedia(nota1, nota2, nota3, letra);

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}