package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12CadastroUsuario {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		int opcao = 0;
		
		while (opcao != 6) {
			
			System.out.println("1 - Cadastrar usuário");
			System.out.println("2 - Listar usuários");
			System.out.println("3 - Remover usuário");
			System.out.println("4 - Buscar usuário");
			System.out.println("5 - Atualizar idade");
			System.out.println("6 - Sair");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if (opcao ==1) {
				Usuario u = new Usuario();
				
				System.out.println("Digite o nome:");
				u.nome = scanner.nextLine();
				
				System.out.println("Digite a idade:");
				u.idade = scanner.nextInt();
				scanner.nextLine();
				
				usuarios.add(u);
			}
			
			if (opcao == 2) {
				for (int i = 0; i < usuarios.size(); i++) {
					Usuario u = usuarios.get(i);
					System.out.println("Nome: " + u.nome + " | Idade: " + u.idade);
					
				}
			}
			
			if (opcao == 3) {
				System.out.println("Digite o nome para remover:");
				String nomeRemover = scanner.nextLine();
				
				for (int i = 0; i < usuarios.size(); i++) {
					if (usuarios.get(i).nome.equals(nomeRemover)) {
						System.out.println("Usuário removido!");
					}
				}
			}
			
			if (opcao == 4)	{
				System.out.println("Digite o nome para buscar:");
				String nomeBuscar = scanner.nextLine();
				
				for (int i = 0; i < usuarios.size(); i++) {
					Usuario u = usuarios.get(i);
					
					if (u.nome.equals(nomeBuscar)) {
						System.out.println("Econtrado:");
						System.out.println("Nome: " + u.nome);
						System.out.println("Idade: " + u.idade);
						
					}
				}
			}
						
					if (opcao == 5) {
						System.out.println("Digite o nome para atualizar:");
						String nomeAtualizar = scanner.nextLine();
						
						for (int i = 0; i < usuarios.size(); i++) {
							Usuario u = usuarios.get(i);
							
							if (u.nome.equals(nomeAtualizar)) {
								System.out.println("Digite a nova idade:");
								u.idade = scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("Idade atualizada!");
							}
						}
					}
				}
	
		scanner.close();
		
		}
	
}

