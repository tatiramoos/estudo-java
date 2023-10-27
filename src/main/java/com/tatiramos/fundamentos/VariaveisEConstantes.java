package com.tatiramos.fundamentos;

public class VariaveisEConstantes {

    public static void main(String[] args) {

        /* Variável: São espaços de memória reservados para armazenar dados que
        podem ser alterados durante a execução do programa.
        --------------------------------------------------------------------------
        Contantes: São espaços de memória reservados para armazenar dados que não
        podem ser alterados durante a execução do programa.
         */
        double raio = 3.4; // variável
        final double PI = 3.14159; //constante

        double area = PI * raio * raio; //calcula a área
        System.out.println(area); // imprime na tela o valor da área calculada

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
        /* Podemos ter um texto associado com uma variável.
        O que é chamado concatenação */
    }
}
