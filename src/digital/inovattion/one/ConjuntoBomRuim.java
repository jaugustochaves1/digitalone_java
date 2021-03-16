package digital.inovattion.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConjuntoBomRuim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Entre com a quantidade de palavras a serem lidas ou digite '0' para sair");
            int N = Integer.valueOf(br.readLine());
            if(N == 0){
                break;
            } else if(N < 0) {
                System.out.println("Entre com um valor maior do que '0'");
            } else {
                List<String> conjunto = new ArrayList<>();
                for (int i = 0; i < N; i++)
                    conjunto.add(br.readLine());
                conjunto = conjunto.stream().sorted().collect(Collectors.toList());
                String saida = "Conjunto Bom";
                for (int i = 0; i < N - 1; i++)
                    if (conjunto.get(i + 1).startsWith(conjunto.get(i)))
                        saida = "Conjunto Ruim";
                System.out.println(saida);
            }
        }
    }
}
