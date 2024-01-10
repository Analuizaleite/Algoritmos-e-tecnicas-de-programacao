import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo:Ler um símbolo do teclado e mostrar as mensagem correspondente
 * Data:11/09/2022
 */
public class questao9 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		char simbolo;
		Scanner teclado = new Scanner(System.in);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Ler um símbolo do teclado
		System.out.println("Digite um símbolo do teclado:");
		simbolo = teclado.next().charAt(0);

		// Identificar o símbolo
		switch (simbolo) {
			case '<':
				System.out.println("Sinal de menor");
				break;
			case '>':
				System.out.println("Sinal de maior");
				break;
			case '=':
				System.out.println("Sinal de igual");
				break;
			default:
				System.out.println("Outro sinal");
				break;
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
