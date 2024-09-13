package desafio2;

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
//
//IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean teste = false;

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        int x = 0;
        int y = 1;
        System.out.print(x+" ");
        System.out.print(y+" ");

        if(n == 0) {
            teste = true;
        }

        for(int i = 0; i < n;i++) {
            int fib = x + y;
            System.out.print(fib+" ");
            x = y;
            y = fib;
                if(n == fib){
                    teste = true;
                }
        }

        if(teste) {
            System.out.println("\nFaz parte da sequencia de fibonacci");
        }
        else {
            System.out.println("\nNão faz parte da sequencia de fibonacci");
        }

    }
}
