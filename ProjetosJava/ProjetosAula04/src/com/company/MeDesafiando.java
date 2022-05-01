package com.company;

import  java.util.Scanner;

public class MeDesafiando {  // Esse desafio é para testar minha capacidade de lógica de programação e aprender Java.
    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Qual número Gostaria de ver a tabuada:");
        num= input.nextInt();

        int mult = 0;

        while(mult <= 10){
            int resultado = num * mult;
            System.out.println(num +" x " + mult + " = " + resultado);
            mult++;

        }
    }
}
