package Interacao;

import java.util.Scanner;

public class InteracaoInicial {
    public void interacaoInicial(Scanner leitor) {
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.print("\n");
        System.out.println("Possui conta?");
        boolean conta = leitor.nextBoolean();
        if (conta) {
            Login chamadaLogin = new Login();
            chamadaLogin.login(leitor);
        }
        else{
            CriarConta chamadaCriarConta = new CriarConta();
            chamadaCriarConta.criarConta(leitor);
        }
    }
}
