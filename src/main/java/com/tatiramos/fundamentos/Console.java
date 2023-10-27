package com.tatiramos.fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia\n\n"); // imprime em uma única linha. \n é uma quebra de linha.

        System.out.println("Bom");
        System.out.println("dia!"); // imprime pulando linha

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "João"); // imprime strings formatados.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.println("Digite o sua idade: ");
        int idade = scan.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
    }
}
