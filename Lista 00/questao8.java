import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Inverter os valores das variáveis A e B
 * Data:31/08/2022
 */
public class questao8 {

    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------//

        // Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        double A, B, aux;

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Definir os valores de A e B
        System.out.println("Insira um valor para a variável A:");
        A = teclado.nextDouble();
        System.out.println("Insira um valor para a a variável B:");
        B = teclado.nextDouble();

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Trocar os valores de A e B
        aux = A;
        A = B;
        B = aux;

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Apresentar os valores finais
        System.out.printf("Após a inversão de valores, A corresponde a %.2f e B a %.2f", A, B);

        // ---------------------------------------------------------------------------------------//

        teclado.close();
    }
}
