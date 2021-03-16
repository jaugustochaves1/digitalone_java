/**
 * Desafio
 * A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.
 *
 * Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.
 *
 * Entrada
 * Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim de arquivo.
 *
 * Saída
 * Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.
 */
package digital.inovattion.one;

import java.util.Scanner;

public class RevisaoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer limite, tamanho, aux;
        while(true) {
            System.out.println("Entre com a palavra a ser revisada ou '.' para sair");
            String texto = scanner.nextLine();
            if(texto.equals(".")){
                break;
            }
            limite = (int) Math.floor(texto.length() / 2);
            tamanho = texto.length();
            aux = 0;
            if(texto.length() == 1) {
                System.out.println(texto);
            } else if (limite >= 1) {
                for (int i = limite; i >= 1; i--) {
                    if(texto.substring(tamanho-i, tamanho).equals(texto.substring(tamanho-(2*i),tamanho-i))) {
                        aux = i;
                        System.out.println(texto.substring(0, (tamanho - aux)));
                    } else if (limite == 1) {
                        System.out.println(texto);
                    }
                }
                if(limite>1 && aux == 0) System.out.println(texto);
            }
        }scanner.close();
    }
}