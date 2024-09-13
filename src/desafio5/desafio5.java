package desafio5;


/*5) Escreva um programa que inverta os caracteres de um string.

        IMPORTANTE:
        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
        b) Evite usar funções prontas, como, por exemplo, reverse;*/

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a String a ser invertida: ");
        String string = sc.nextLine();
        String[] tranf = new String[string.length()];
        int j = 0;

        for(int i = string.length()-1; i >= 0;i--) {
            tranf[j] = String.valueOf(string.charAt(i));
            j++;
        }

        StringBuilder sb = new StringBuilder();
            for(String s: tranf) {
                sb.append(s);
            }
            String stringInvertida  = sb.toString();
            System.out.println("String invertida = "+stringInvertida);

            sc.close();
    }
}
