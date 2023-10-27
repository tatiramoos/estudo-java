package com.tatiramos.fundamentos;

/*
A classe String em Java fornece uma variedade de métodos para criar e manipular strings. Aqui estão alguns dos métodos mais comuns:

- length(): Retorna o comprimento da string.
- charAt(int index): Retorna o caractere na posição especificada.
- equals(Object obj): Compara duas strings para igualdade.
- equalsIgnoreCase(String anotherString): Compara duas strings para igualdade, ignorando diferenças entre maiúsculas e minúsculas.
- toUpperCase(): Converte a string para caixa alta.
- toLowerCase(): Converte a string para caixa baixa.
- concat(String str): Concatena duas strings.
- substring(int beginIndex): Obtém uma substring da string, começando na posição especificada.
- substring(int beginIndex, int endIndex): Obtém uma substring da string, começando na posição especificada e terminando na posição especificada.
- startsWith(String prefix): Verifica se a string começa com o prefixo especificado.
- endsWith(String suffix): Verifica se a string termina com o sufixo especificado.
- indexOf(String substring): Retorna a posição da primeira ocorrência da substring na string.
- lastIndexOf(String toLowerCase): Retorna a posição da última ocorrência da substring na string.
- replace(char oldChar, char newChar): Substitui todas as ocorrências do caractere antigo pelo caractere novo.
- replace(CharSequence oldString, CharSequence newString): Substitui todas as ocorrências da string antiga pela string nova.
- trim(): Remove os espaços em branco do início e do fim da string.
- split(String regex): Divide a string em um array de strings, usando o padrão especificado.
 */

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));

    }
}
