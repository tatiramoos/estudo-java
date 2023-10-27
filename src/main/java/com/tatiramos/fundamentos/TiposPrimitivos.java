package com.tatiramos.fundamentos;

public class TiposPrimitivos {

    /*
    Em Java, os tipos primitivos são tipos de dados básicos que não são objetos.
    Eles são usados para armazenar valores simples, como números, caracteres e booleanos.

    --------------------------------------------------------------------------------------

    Existem oito tipos primitivos em Java:

    - byte: Um byte pode armazenar um valor inteiro de 8 bits, com um intervalo de -128 a 127.
    - short: Um short pode armazenar um valor inteiro de 16 bits, com um intervalo de -32768 a 32767.
    - int: Um int pode armazenar um valor inteiro de 32 bits, com um intervalo de -2147483648 a 2147483647.
    - long: Um long pode armazenar um valor inteiro de 64 bits, com um intervalo de -9223372036854775808 a 9223372036854775807.
    - float: Um float pode armazenar um valor de ponto flutuante de 32 bits, com uma precisão de 7 dígitos.
    - double: Um double pode armazenar um valor de ponto flutuante de 64 bits, com uma precisão de 16 dígitos.
    - char: Um char pode armazenar um caractere Unicode, com um intervalo de 0 a 65535.
    - boolean: Um boolean pode armazenar um valor booleano, que pode ser true ou false.

    Os tipos primitivos são armazenados na memória do computador de forma eficiente.
    Eles são também mais rápidos de operar do que objetos.
     */

    public static void main(String[] args) {
        // informações do funcionario

        // tipos númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDevoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDevoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
