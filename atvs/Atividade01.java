package com.facimp.atvs;

import java.util.Scanner;

public class Atividade01 {
    static void pausa(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void calcular(int x) {
        int soma = 0;
        for (int i = 0; i < x; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a " + x + " é: " + soma);
    }

    static double calcularMedia(double[] x) {
        double media = 0;
        for (int i = 0; i < x.length; i++) {
            media += x[i];
        }
        ;
        media = media / x.length;

        return media;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeSoma = 10;
        String senha = "Heisenberg";
        double[] vetorNotas = new double[3];

        System.out.println("Entre com a senha, dica: 'Say my name'");
        String senhaDigitada = scan.nextLine();
        while (!senhaDigitada.equalsIgnoreCase(senha)) {
            senhaDigitada = scan.nextLine();
        }
        if (senhaDigitada.equalsIgnoreCase(senha)) {
            System.out.println("Acesso liberado");
        }
        System.out.println("Carregando...");
        pausa(1000);
        pausa(1000);
        System.out.println("Iniciando primeiro teste...");
        pausa(1500);
        calcular(quantidadeDeSoma);
        pausa(2000);
        System.out.println("Iniciando segundo teste...");
        pausa(1500);
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Insira o valor da nota: " + i + 1);
            vetorNotas[i] = scan.nextDouble();

        }
        double media = calcularMedia(vetorNotas);
        System.out.println("A média dos notas é: " + media);
    }

}


