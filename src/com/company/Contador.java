package com.company;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
	    Scanner numeros = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int paramentroUm = numeros.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int paramentroDois = numeros.nextInt();

        try {
            contar(paramentroUm, paramentroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println("Paramentro invalido, Segundo paramentro deve ser maior que o primeiro.");

        }
    }

    static void contar( int paramentroum, int paramentrodois) throws ParametrosInvalidosException{
        if (paramentrodois < paramentroum){
            throw new ParametrosInvalidosException();
        }
        int n = 1;
        int contagem = paramentrodois - paramentroum;

        while(n <= contagem){
            System.out.println("Imprimindo o nº " + n);
            n++;
        }
    }
}
