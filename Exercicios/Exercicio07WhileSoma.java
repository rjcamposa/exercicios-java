package exercicios;

import java.util.Scanner;

public class Exercicio07WhileSoma {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        int soma = 0;

        while (numero != 0) {

            System.out.println("Digite um número:");
            numero = scanner.nextInt();

            soma = soma + numero;
        }

        System.out.println("Soma total: " + soma);

        scanner.close();
    }
}