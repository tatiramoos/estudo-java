package com.tatiramos.fundamentos;

public class InferenciaDeTipos {

    public static void main(String[] args) {

        /*
        A inferência de tipos em Java é uma técnica que permite ao compilador inferir
        o tipo de uma variável a partir do contexto em que ela é declarada. Isso significa
        que o programador não precisa declarar explicitamente o tipo da variável,
        o que pode tornar o código mais conciso e legível.

        Inferir é deduzir um resultado, por lógica, com base na interpretação de outras informações.
         */

        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        a = 12;
        System.out.println(a);

        // a = " ... "; - mudar ou misturar os tipos não é permitido em java.

        var b = 4.5; // o java vai inferir pelo valor atribuído qual é o tipo da variável. Nesse caso, o valor é do tipo double.
        System.out.println(b);

        var c = "Texto"; // o java vai inferir que essa variável é do tipo String.
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        // c = 4.5; - mudar ou misturar os tipos não é permitido em java.

        double d; // variável foi declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d); // usada!

        /* var e;
        e = 123.45;
        Não é permitido fazer o mesmo usando o var. Na hora que você declara a
        variável você precisa inicializar ela. Porque é a partir da inicializacao que o java
        consegue inferir qual o tipo de dado associado aquela variável.
         */

        var f = 12; // valor inteiro
        // f = 12.01; // um vez nao consegue colocar valor com casas decimais. O contrario pode!
        System.out.println(f);
    }
}
