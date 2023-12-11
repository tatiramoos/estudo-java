package com.tatiramos.fundamentos;

public class ConversaoDeTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // conversão implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // conversão explícita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;

        double e = 1.99999999; // conversão explícita (CAST)
        int f = (int) e;
        System.out.println(f);
    }
}
