import java.util.Scanner;

/*Autora: Ana Luíza GonçalveS Leite
 * Objetivo: Encontra o valor da hipotenusa de um triângulo retângulo
 * Data: 31/08/2022
 */
public class questao5 {

	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------------//

		// Declaração das variáveis
		Scanner teclado = new Scanner(System.in);
		double catetoAdj, catetoOp, hipotenusa, x, y;

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Receber o valor dos catetos
		System.out.println("Insira o valor do cateto adjacente:");
		catetoAdj = teclado.nextDouble();
		System.out.println("Insira o valor do cateto oposto:");
		catetoOp = teclado.nextDouble();

		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//

		// Calcular a hipotenusa
		x = Math.pow(catetoAdj, 2);
		y = Math.pow(catetoOp, 2);
		hipotenusa = (x + y);

		// ---------------------------------------------------------------------------------------//
		// Apresentar o valor da hipotenusa
		System.out.printf(
				"O valor da hipotenusa em um triângulo retângulo com os catetos de valor %.2f e %.2f é de %.2f:", catetoOp,
				catetoAdj, hipotenusa);

		teclado.close();
	}
}
