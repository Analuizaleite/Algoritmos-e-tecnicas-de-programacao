import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Receba o ano de nascimento de uma pessoa, determine sua idade considerando o ano 2022 e verifique se ela tem idade suficiente para obter a Carteira de Habilitação (maior de 18 anos), levando em conta se já fez aniversário no ano atual.
 * Data:09/09/2022
 */
public class questao3 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		int anoNascimento, idade;
		char fezAniversario;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o ano de nascimento
		System.out.println("Insira o ano de nascimento:");
		anoNascimento = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber se já fez aniversário em 2022
		System.out.println("Insira 'S' se já fez aniversário no ano de 2022 e 'N' caso não feito");
		fezAniversario = teclado.next().charAt(0);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular a idade no ano de 2022
		if (fezAniversario == 'S') {
			idade = 2022 - anoNascimento;
		} else {
			idade = 2022 - anoNascimento - 1;
		}

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Verificar se já tem idade para conseguir a habilitação
		if (idade >= 18) {
			System.out.println("Pode tirar Carteira de Habilitação. Essa pessoa possui " + idade + " anos");
		} else {
			System.out.println("Espere completar 18 anos para tirar a carteira de habilitação. Essa pessoa possui "
					+ idade + " anos");
		}

		// ---------------------------------------------------------------------------------------//

		teclado.close();

	}
}
