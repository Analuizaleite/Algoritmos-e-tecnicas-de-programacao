import java.util.Scanner;

/*Autora:Ana Luíza Gonçalves Leite
 * Objetivo: ler coeficientes da equação,calcular e mostrar a raiz se ela existir
 * Data:11/09/2022
 */
public class questao6 {

    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------//

        // Declaração de variáveis
        Scanner teclado = new Scanner(System.in);
        double a, b, x;

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Determinar os valores
        System.out.println("Insira um valor para 'A'");
        a = teclado.nextDouble();
        System.out.println("Insira um valor para 'B'");
        b = teclado.nextDouble();

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Exibir a raiz da equação
        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação possui infinitas soluções.");
            } else {
                System.out.println("A equação não possui solução.");
            }
        } else if (b == 0) {
            x = 0;
            System.out.println("A raiz da equação é: " + x);
        } else {
            // Calcular a raiz
            x = (-b / a);
            System.out.println("A raiz da equação é: " + x);
        }

        // ---------------------------------------------------------------------------------------//

        teclado.close();
    }

}
