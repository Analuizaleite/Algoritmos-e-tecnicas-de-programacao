import java.util.Scanner;
import java.io.*;

/* Objetivo: produzir uma mochila resultante da evolução de Pokémons a partir da leitura de um arquivo com a mochila original
 * Autores: Ana Luíza Gonçalves Leite e João Victor Vasconcellos de Santana
 * Data de início: 05/12/2022
 * Última atualização:08/12/2022
 */

public class novoPokémon {

	// ---------------------------------------------------------------------------------------//

	// Função que armazena e lê os arquivos na memória
	public static String armazenarMochila() {
		String mochila = new String();
		try {

			// Declaração do caminho do arquivo e Scanner para a leitura dele
			File arqMochila = new File("C:\\temp\\mochila.txt");
			Scanner lerMochila = new Scanner(arqMochila);

			// Enquanto o arquivo possuir linhas, separá-las por espaço
			while (lerMochila.hasNextLine()) {
				mochila += lerMochila.nextLine() + " ";
			}

			lerMochila.close();
		}

		catch (IOException iex) {
			System.out.println("Erro");
		}

		// Retorno da mochila separada por espaços
		return (mochila);
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento que evolui os Pokemons e produz uma mochila resultante
	public static void produzirMochilaResultante(String[] conteudoMochila) {

		try {
			// Declaração do caminho e leitura do arquivo com a tabela de Pokémons
			File evolucao = new File("C:\\temp\\evolucao.txt");
			Scanner lerEvol = new Scanner(evolucao);

			// String para armazenar a quantidade de Pokémons evoluídos
			String evoluidos = new String();

			// File Writer para adicionar um novo arquivo, a mochila resultante
			FileWriter resultante = new FileWriter("C:\\temp\\mochilaResultante.txt");

			// Variável para armazenar em um vetor as posições separadas por espaço
			String[] tabelaEvolucao;

			// Enquanto o arquivo de evolução possuir linhas, separá-las por espaços e
			// adicionar ao vetor
			while (lerEvol.hasNextLine()) {
				evoluidos += lerEvol.nextLine() + " ";
			}
			tabelaEvolucao = evoluidos.split(" ");

			for (int i = 0; i < conteudoMochila.length; i++) {
				// Separa os Pokémons do arquivo mochila.txt pelos ';' e os armazena no vetor
				String[] pokemonMochila = conteudoMochila[i].split(";");

				// Estrutura de repetição que percorre a tabela procurando o Pokémon da mochila
				for (int j = 0; j < tabelaEvolucao.length; j++) {

					// Separa os Pokémons do arquivo evolucao.txt pelos ';' e os armazena no vetor
					String[] pokemonTabela = tabelaEvolucao[j].split(";");

					// Compara se os Pokémons existem tanto na mochila quanto na tabela
					if (pokemonMochila[0].equals(pokemonTabela[0])) {

						// Converte de String para inteiro os candies disponíveis do usuário e a quantidade necessária para a evolução
						int candiesDisponiveis = Integer.parseInt(pokemonMochila[2]);
						int candiesNecessarios = Integer.parseInt(pokemonTabela[1]);

						// Converte de String para inteiro a quantidade dos Pokémons disponíveis do usuário
						int pokemonsDisponiveis = Integer.parseInt(pokemonMochila[1]);

						String nomeEvolucao = pokemonTabela[2];

						// Contagem de Pokémons evoluídos
						int pokemonsEvoluidos = 0;

						// Enquanto existirem candies necessários para a evolução e Pokémons disponiveis,subtrair os candies e adicionar no contador de Pokémons que foram evoluídos
						while (candiesDisponiveis >= candiesNecessarios && pokemonsEvoluidos < pokemonsDisponiveis) {
							candiesDisponiveis -= candiesNecessarios;
							pokemonsEvoluidos++;
						}

						// Escreve no arquivo a mochila resultante dos Pokémons
						resultante.write(nomeEvolucao + ";" + pokemonsEvoluidos + ";" + candiesDisponiveis + "\n");

					}
				}
			}
			lerEvol.close();
			resultante.close();
		}

		catch (IOException iex) {
			System.out.println("Erro");
		}
	}
	// ---------------------------------------------------------------------------------------//

	// ---------------------------------------------------------------------------------------//

	// Procedimento com o menu de opçoes que aciona os outros métodos e funções através dos cases
	public static void menu() throws FileNotFoundException {

		// ---------------------------------------------------------------------------------------//
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		// ---------------------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------------------//
		while (opcao != 5) {

			System.out.println(" ");
			System.out.println("Menu de opções:");
			System.out.println("Selecione a opção desejada");
			System.out.println("1 - carregar tabela de evolução");
			System.out.println("2 - carregar mochila");
			System.out.println("3 - evoluir mochila");
			System.out.println("4 - exibir mochila evoluída no console");
			System.out.println("5 - sair");
			System.out.println(" ");

			opcao = teclado.nextInt();

			switch (opcao) {

				// Exibe a tabela da evolução
				case 1:
					File evolucao = new File("C:\\temp\\evolucao.txt");
					Scanner lerEvolucao = new Scanner(evolucao);
					while (lerEvolucao.hasNextLine()) {
						System.out.println(lerEvolucao.nextLine());
					}
					lerEvolucao.close();
					break;

				// Exibe a mochila do usuário
				case 2:
					File mochila = new File("C:\\temp\\mochila.txt");
					Scanner lerMochila = new Scanner(mochila);
					while (lerMochila.hasNextLine()) {
						System.out.println(lerMochila.nextLine());
					}
					lerMochila.close();
					break;

				// Armazena no vetor o retorno da funcão que armazena os dados na memória.
				// Chamada da função que evolui a mochila e envia por parâmetro o vetor
				case 3:
					String[] conteudoMochila = armazenarMochila().split(" ");
					produzirMochilaResultante(conteudoMochila);
					break;

				// Exibe a mochila resultante com as evoluções
				case 4:
					File resultante = new File("C:\\temp\\mochilaResultante.txt");
					Scanner lerResultante = new Scanner(resultante);
					while (lerResultante.hasNextLine()) {
						System.out.println(lerResultante.nextLine());
					}
					lerResultante.close();
					break;

				// Sair do programa
				case 5:
					System.out.println("Saiu do programa");
					break;
				default:
					System.out.println("Erro");
					break;
			}
			// ---------------------------------------------------------------------------------------//
		}
		teclado.close();
	}
	// ---------------------------------------------------------------------------------------//

	public static void main(String[] args) throws FileNotFoundException {

		// ---------------------------------------------------------------------------------------//

		// Chamada do procedimento
		menu();

		// ---------------------------------------------------------------------------------------//
	}
}
