package exercicios;

import java.util.ArrayList;

public class UsuarioService {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(Usuario u) {
        usuarios.add(u);
        System.out.println("Usuário cadastrado!");
    }

    public void listar() {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            System.out.println("Nome: " + u.getNome() + " | Idade: " + u.getIdade());
        }
    }

    public void remover(String nome) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome().equals(nome)) {
                usuarios.remove(i);
                System.out.println("Usuário removido!");
            }
        }
    }

    public void buscar(String nome) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);

            if (u.getNome().equals(nome)) {
                System.out.println("Encontrado:");
                System.out.println("Nome: " + u.getNome());
                System.out.println("Idade: " + u.getIdade());
            }
        }
    }

    public void atualizar(String nome, int idade) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);

            if (u.getNome().equals(nome)) {
                u.setIdade(idade);
                System.out.println("Idade atualizada!");
            }
        }
    }
}