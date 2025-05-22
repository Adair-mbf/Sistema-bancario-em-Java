package Interacao;
import Conta.ContaCorrente;
import Conta.ContaEmpresarial;
import Conta.ContaEspecial;
import Conta.ContaPoupanca;

import java.util.Scanner;

public class Login {

    void login(Scanner leitor){
        System.out.println("Digite o tipo de conta em que deseja logar:\n1 - Conta corrente\n2 - Conta empresarial\n3 - Conta especial\n4 - Conta poupança");
        byte opcao = leitor.nextByte();
        switch (opcao) {
            case 1:
                loginContaCorrente(leitor);
                break;
            case 2:
                loginContaEmpresarial(leitor);
                break;
            case 3:
                loginContaEspecial(leitor);
                break;
            case 4:
                loginContaPoupanca(leitor);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void loginContaCorrente(Scanner leitor){
        System.out.println("Digite o seu nome completo:");
        String nome = leitor.nextLine();
        System.out.println("Digite a sua senha:");
        String senha = leitor.nextLine();
        System.out.println("Digite o seu CPF:");
        String cpf = leitor.nextLine();
        System.out.println("Conta logada com sucesso!");
        ContaCorrente novoLogin = new ContaCorrente();
        novoLogin.interacao(leitor);
    }
    private void loginContaEmpresarial(Scanner leitor){
        System.out.println("Digite o nome da empresa:");
        String nome = leitor.nextLine();
        System.out.println("Digite a senha:");
        String senha = leitor.nextLine();
        System.out.println("Digite o CNPJ:");
        String cnpj = leitor.nextLine();
        System.out.println("Conta logada com sucesso!");
        ContaEmpresarial novoLogin2 = new ContaEmpresarial();
        novoLogin2.interacao(leitor);
    }
    private void loginContaEspecial(Scanner leitor){
        System.out.println("Digite o seu nome completo:");
        String nome = leitor.nextLine();
        System.out.println("Digite a sua senha:");
        String senha = leitor.nextLine();
        System.out.println("Digite o seu CPF:");
        String cpf = leitor.nextLine();
        System.out.println("Conta logada com sucesso!");
        ContaEspecial novoLogin3 = new ContaEspecial();
        novoLogin3.interacao(leitor);
    }
    private void loginContaPoupanca(Scanner leitor){
        System.out.println("Digite o seu nome completo:");
        String nome = leitor.nextLine();
        System.out.println("Digite a sua senha:");
        String senha = leitor.nextLine();
        System.out.println("Digite o seu CPF:");
        String cpf = leitor.nextLine();
        System.out.println("Conta logada com sucesso!");
        ContaPoupanca novoLogin4 = new ContaPoupanca();
        novoLogin4.interacao(leitor);
    }
}
