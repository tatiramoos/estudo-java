package com.tatiramos.desafios;

public class DesafioVariaveisEConstantes {

    /*
    Desafio do cálculo da temperatura:
    Dado um valor, converta temperatura em Fahrenheit para Celsius.
    Fórmula: (°F - 32) x 5/9 = °C
    Importante: Usamos letras maiúsculas para declarar constantes e assim distingui-las das variáveis.
     */

    public static void main(String[] args) {
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        int fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");

        fahrenheit = 0;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");

        fahrenheit = 100;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");
    }
}
