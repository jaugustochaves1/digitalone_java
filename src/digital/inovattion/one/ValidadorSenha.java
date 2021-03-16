package digital.inovattion.one;

import java.util.Scanner;

public class ValidadorSenha {
    public final static int MAX = 32;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String senha;
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String permitidos = "[a-zA-Z0-9]+";
        while(true) {
            System.out.println("Entre com a senha ou de um Enter para sair:");
            senha = scr.nextLine();
            if(senha.isBlank()){
                break;
            }
            if(senha.length() >=6 && senha.length() <= MAX && senha.matches(permitidos) && senha.matches(requeridos)){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
