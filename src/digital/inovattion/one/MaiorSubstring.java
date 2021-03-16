package digital.inovattion.one;

import java.util.Scanner;

public class MaiorSubstring {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String frase1, frase2;

        while(true) {
            System.out.println("Entre com 2 frases ou digite '.' para sair");
            frase1 = scr.nextLine();
            if(frase1.equals(".")){
                break;
            }
            frase2 = scr.nextLine();
            int maiorIgualdade = 0;
            if (frase2.length() > frase1.length()) {
                String maiorPalavra = frase2;
                frase2 = frase1;
                frase1 = maiorPalavra;
            }
            for (int i = 0; i < frase2.length(); i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (frase1.contains(frase2.substring(j, frase2.length() - i + j))) {
                        maiorIgualdade = Math.max(maiorIgualdade, frase2.length() - i);
                    }
                }
            }
            System.out.println("Maior igualdade é: " + maiorIgualdade);
        }
    }
}
