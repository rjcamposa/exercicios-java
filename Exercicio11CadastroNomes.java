package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11CadastroNomes {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			ArrayList<String> nomes = new ArrayList<>();
			
			int opcao = 0;
			
			while (opcao != 3) {
				
				System.out.println("1 - Adicionar nome");
				System.out.println("2 - Listar nomes");
				System.out.println("3 - Sair");
				System.out.println("4 - Remover nome");
				
				opcao = scanner.nextInt();
				scanner.nextLine();
				
				if (opcao == 1) {
					System.out.println("Digite o nome");
					String nome = scanner.nextLine();
					nomes.add(nome);
				}
				
				if (opcao ==2) {
					for (int i = 0; i < nomes.size(); i++) {
						System.out.println("Nome: " + nomes.get(i));
					}
					System.out.println("Total de nomes: " + nomes.size());
				}	
				
			}
				
				scanner.close();
				
			}
			
		}