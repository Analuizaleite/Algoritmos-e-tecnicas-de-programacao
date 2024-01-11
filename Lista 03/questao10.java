import java.util.Scanner;

/* Autora: Ana Luíza Gonçalves Leite
 * Objetivo: função para determinar a categoria de um nadador de acordo com sua idade
 * Data:06/10/2022
 */
public class questao10 {

	// ---------------------------------------------------------------------------------------//

	// Função que retorna a categoria correspondente a idade do nadador recebida por parâmetro
	public static String categoriaNadador(int idade) {

		if (idade >= 5 && idade <= 7) {
			return ("Categoria F");
		} else if (idade >= 8 && idade <= 10) {
			return ("Categoria E");
		} else if (idade >= 11 && idade <= 13) {
			return ("Categoria D");
		} else if (idade >= 14 && idade <= 15) {
			return ("Categoria C");
		} else if (idade >= 16 && idade <= 17) {
			return ("Categoria B");
		} else {
			return ("Categoria A");
		}
	}

	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int idade;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber a idade do nadador
		System.out.println("Insira a idade do nadador:");
		idade = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Chamada da função e impressão do valor retornado por ela
		System.out.println(categoriaNadador(idade));

		// ---------------------------------------------------------------------------------------//

		teclado.close();
	}
}
