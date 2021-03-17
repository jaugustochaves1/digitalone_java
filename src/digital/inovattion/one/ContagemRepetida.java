package digital.inovattion.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int itens =sc.nextInt();
        while( itens-- > 0)
            lista.add(sc.nextInt());

        SortedMap<Integer, Integer> variavel = new TreeMap<>();
        lista.forEach(id -> variavel.put( id, 0));
        lista.forEach(id -> variavel.compute(id, ( key , value ) -> ( key == null ? 1 : value + 1)));

        variavel.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}
