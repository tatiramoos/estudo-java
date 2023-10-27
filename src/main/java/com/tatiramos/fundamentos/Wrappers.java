package com.tatiramos.fundamentos;

/*
Wrappers em Java são classes que representam tipos de dados primitivos. Eles fornecem uma camada de abstração sobre os tipos de dados primitivos, tornando-os mais fáceis de usar e gerenciar.

Existem wrappers para todos os oito tipos de dados primitivos em Java:

- byte -> Byte
- short -> Short
- int -> Integer
- long -> Long
- float -> Float
- double -> Double
- char -> Character
- boolean -> Boolean
- Os wrappers fornecem uma série de vantagens sobre os tipos de dados primitivos, incluindo:

- Autoboxing e unboxing: Os wrappers fornecem autoboxing e unboxing automático, o que torna
 conveniente converter entre tipos de dados primitivos e seus respectivos wrappers.
- Métodos: Os wrappers fornecem uma variedade de métodos úteis para manipular os dados que
 eles representam. Por exemplo, o wrapper Integer fornece métodos para converter um
 número inteiro para uma string, para verificar se um número é primo e para calcular o fatorial
  de um número.
- Null safety: Os wrappers são objetos, o que significa que eles podem ser nulos. Isso torna os
 wrappers mais seguros de usar do que os tipos de dados primitivos, pois evita erros de ponteiro nulo.
 */

public class Wrappers {

    public static void main(String[] args) {

        Byte b = 100; //byte
        Short s = 1000; //short

        Integer i = 10000; // int
        Long l = 100000L; //long

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F; // float
        System.out.println(f);

        Double d = 1234.5678; // double
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true"); // boolean
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c + "...");




    }
}
