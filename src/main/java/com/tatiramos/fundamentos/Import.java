package com.tatiramos.fundamentos;

/*
Em Java, a instrução import é usada para importar classes, métodos e pacotes de outras bibliotecas.
Isso permite que você use o código de outras bibliotecas em seu próprio código sem precisar reescrevê-lo.

Importações explícitas: As importações explícitas são usadas para importar classes, métodos ou pacotes
específicos. Por exemplo, para importar a classe Scanner do pacote java.util, você pode usar o seguinte código:
import java.util.Scanner;

Importações implícitas: As importações implícitas são usadas para importar todas as classes de um pacote.
Por exemplo, para importar todas as classes do pacote java.util, você pode usar o seguinte código:
import java.util.*;

As importações são feitas no início do arquivo Java, antes da declaração da classe.
 Você pode importar várias classes ou pacotes em uma única instrução import.

 Importante: Sempre confira se você está fazendo o importe correto. Muitas vezes seu código não
 funcionará corretamente por causa de um import errado.
 */

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date d = new Date();
        System.out.println(d);

        JButton botao = new JButton();
    }
}
