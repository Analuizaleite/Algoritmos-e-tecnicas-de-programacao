import java.util.Scanner;

/*Autor: Ana Luíza Gonçalves Leite
 * Objetivo: ler a velocidade máxima e a velocidade do mostorista. Verificar se o motorista ultrapassou o limite e se levará uma multa
 * Data: 11/09/2022
 */
public class questao10 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int velocidadeMax, velocidadeMotorista;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber as velocidades

		// Valor para velocidade máxima
		System.out.println("Insira valor para velocidade máxima permitida na avenida: ");
		velocidadeMax = teclado.nextInt();

		// Valor da velocidade do motorista
		System.out.println("Insira o valor da velocidade do motorista: ");
		velocidadeMotorista = teclado.nextInt();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Multado ou não
		if (velocidadeMotorista <= velocidadeMax) {
			System.out.println("Motorista respeitou a lei");
		} else if (velocidadeMotorista <= (velocidadeMax + 10)) {
			System.out.println("Multa de 50 reais");
		} else if (velocidadeMotorista >= (velocidadeMax + 11) && velocidadeMotorista <= (velocidadeMax + 30)) {
			System.out.println("Multa de 100 reais");
		} else {
			System.out.println("Multa de 200 reais");
		}

		// ---------------------------------------------------------------------------------------//
		
		teclado.close();

	}
}
