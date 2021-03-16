package digital.inovattion.one;
import java.util.*;

public class Divisores {
    static int A, B, C, D;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pense um número positivo N.");
        System.out.println("Agora me diga um divisor de N.");
        A = scanner.nextInt();
        System.out.println("Agora me dê um outro número que não seja divisor de N.");
        B = scanner.nextInt();
        System.out.println("Agora um número múltiplo N.");
        C = scanner.nextInt();
        System.out.println("Agora um número não múltiplo N.");
        D = scanner.nextInt();
        // boolean nExists = false;
        int n = -1;
        int sqrtC = (int) Math.sqrt(C);
        for (int i = 1; i <= sqrtC; ++i) {
            if (C % i == 0) {
                if (checkConditionsABD(i)) {
                    n = i;
                    break;
                } else if (checkConditionsABD(C / i)) {
                    n = C / i;
                }
            }
        }
        System.out.println("O número que você pensou é..." + n);
        scanner.close();
    }

    static boolean checkConditionsABD(int i) {
        if ((i % A == 0) && (i % B != 0) && (D % i != 0)) {
            return true;
        }
        return false;
    }
}
