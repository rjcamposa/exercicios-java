package exercicios;

import java.util.Scanner;

public class Exercicio12CadastroUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UsuarioService service = new UsuarioService();

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

            if (opcao == 1) {
                Usuario u = new Usuario();

                System.out.println("Digite o nome:");
                u.setNome(scanner.nextLine());

                System.out.println("Digite a idade:");
                u.setIdade(scanner.nextInt());
                scanner.nextLine();
                
                System.out.println("Digite o email:");
                u.setEmail(scanner.nextLine());

                service.cadastrar(u);
            }

            if (opcao == 2) {
                service.listar();
            }

            if (opcao == 3) {
                System.out.println("Digite o nome:");
                service.remover(scanner.nextLine());
            }

            if (opcao == 4) {
                System.out.println("Digite o nome:");
                service.buscar(scanner.nextLine());
            }

            if (opcao == 5) {
                System.out.println("Digite o nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite a nova idade:");
                int idade = scanner.nextInt();
                scanner.nextLine();

                service.atualizar(nome, idade);
            }
        }

        scanner.close();
    }
}