package aula2;

import java.util.Scanner;

public class Ficha2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        System.out.print(" Número de inteiros a ler ?: ");
        int n = sc.nextInt();

        int[] valores = new int[n];

        for (int i = 0; i < n; i++) {
            valor = sc.nextInt();
            valores[i] = valor;
        }
        sc.close();
        System.out.println("O valor minimo introduzido é: " + Exercicio1.minArray(valores));
        ;
    }

}
