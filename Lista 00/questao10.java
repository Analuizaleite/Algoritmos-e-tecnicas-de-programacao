import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Calcular a partir de um horário, quantos minutos do dia já se passaram
 * Data: 31/08/2022
 */

public class questao10 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int hora, minutos, horaEmMinutos, decorrido;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Determinar a hora
		System.out.println("Insira as horas:");
		hora = teclado.nextInt();
		System.out.println("Insira os minutos:");
		minutos = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Fazer a conversão
		horaEmMinutos = (60 * hora);
		decorrido = (horaEmMinutos + minutos);

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Apresentar o resultado final
		System.out.printf("Desde o começo do dia, até o horário inserido, %d:%d, já se passaram %d minutos", hora,
				minutos, decorrido);

		// ---------------------------------------------------------------------------------------//
		teclado.close();
	}
}
