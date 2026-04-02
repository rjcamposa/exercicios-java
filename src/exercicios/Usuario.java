package exercicios;

public class Usuario {
	
	private String nome;
	private int idade;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;

	}
	
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Idade inválida!");
		} else {
			this.idade = idade;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}