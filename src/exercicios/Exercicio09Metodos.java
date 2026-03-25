package exercicios;

public class Exercicio09Metodos {
	
	public static void main(String [] args) {
		
		int numero = 8;
		
		if (ehPar(numero)) {
			System.out.println("É par");
		} else {
			System.out.println("É ímpar");
		}
		
		int resultado = somar(20, 20);
		System.out.println("Resultado da soma: " + resultado);
	}
	
	public static void saudacao() {
		System.out.println("Bem-vindo ao sistema!");
	}
	
	public static void mostrarNumero(int numero) {
		System.out.println("Número: " + numero);
	}
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static boolean ehPar(int numero) {
		return numero % 2 ==0;
		}
}
