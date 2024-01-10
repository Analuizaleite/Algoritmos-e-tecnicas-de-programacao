import java.util.Scanner;

/*Autora: Ana Luíza Gonçalves Leite
 * Objetivo: Calcular de um retângulo: perímetro, área e diagonal
 * Data:31/08/2022
 */
public class questao3 {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------//

        // Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        double area, perimetro, diagonal, altura, base, x, y;

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Valores da base e altura
        System.out.println("Insira o valor da base do retângulo:");
        base = teclado.nextDouble();
        System.out.println("Insira o valor da altura do retâmgulo");
        altura = teclado.nextDouble();

        // ---------------------------------------------------------------------------------------//

        // ---------------------------------------------------------------------------------------//

        // Cálculo do perímetro
        perimetro = (base + base + altura + altura);
     
        // Cálculo da área
        area = (base * altura);

        // Cálculo da diagonal
        x = Math.pow(altura, 2);
        y = Math.pow(base, 2);
        diagonal = Math.sqrt(x + y);

        // ---------------------------------------------------------------------------------------//

        // Apresentação dos resultados
        System.out.printf("O valor do perímetro do retângulo é de %.2f\n", perimetro);
        System.out.printf("O valor da área do retângulo é de %.2f\n", area);
        System.out.printf("O valor da diagonal do retângulo é de %.2f", diagonal);

        teclado.close();
    }
}
