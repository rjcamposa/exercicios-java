package exercicios;

import java.util.Scanner;

public class Exercicio08MaiorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        int quantidade = 0;
        int maior = 0;

        while (numero != 0) {

            System.out.println("Digite um número:");
            numero = scanner.nextInt();

            if (numero != 0) {

                quantidade++;

                if (numero > maior) {
                    maior = numero;
                }
            }
        }

        System.out.println("Quantidade: " + quantidade);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
