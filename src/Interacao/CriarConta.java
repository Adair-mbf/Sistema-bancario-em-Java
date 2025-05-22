package Interacao;
import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;

import java.util.Scanner;

public class CriarConta {
    void criarConta(Scanner leitor){
        System.out.println("Digite o tipo de conta que deseja criar:\n1 - Conta corrente\n2 - Conta empresarial\n3 - Conta especial\n4 - Conta poupança");
        byte opcao = leitor.nextByte();
        switch (opcao) {
            case 1:
                criarContaCorrente(leitor);
                break;
            case 2:
                criarContaEmpresarial(leitor);
                break;
            case 3:
                criarContaEspecial(leitor);
                break;
            case 4:
                criarContaPoupanca(leitor);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void criarContaCorrente(Scanner leitor){
        System.out.println("Digite o seu nome completo:");
        String nome = leitor.nextLine();
        System.out.println("Digite a senha que deseja criar:");
        String senha = leitor.nextLine();
        System.out.println("Digite o seu CPF:");
        String cpf = leitor.nextLine();
        PessoaFisica contaCorrente1 = new PessoaFisica(nome, senha, cpf);
        System.out.println("Conta criada com sucesso!");
    }
    private void criarContaEmpresarial(Scanner leitor){
        System.out.println("Digite o nome da empresa:");
        String nome = leitor.nextLine();
        System.out.println("Digite a senha que deseja criar:");
        String senha = leitor.nextLine();
        System.out.println("Digite o CNPJ:");
        String cnpj = leitor.nextLine();
        PessoaJuridica contaEmpresarial1 = new PessoaJuridica(nome, senha, cnpj);
        System.out.println("Conta criada com sucesso!");
    }
    private void criarContaEspecial(Scanner leitor){
        System.out.println("Digite o seu nome completo:");
        String nome = leitor.nextLine();
        System.out.println("Digite a senha que deseja criar:");
        String senha = leitor.nextLine();
        System.out.println("Digite o seu CPF:");
        String cpf = leitor.nextLine();
        PessoaFisica contaEspecial1 = new PessoaFisica(nome, senha, cpf);
        System.out.println("Conta criada com sucesso!");
    }
    private void criarContaPoupanca(Scanner leitor){
        System.out.println("Digite o seu nome completo:");
        String nome = leitor.nextLine();
        System.out.println("Digite a senha que deseja criar:");
        String senha = leitor.nextLine();
        System.out.println("Digite o seu CPF:");
        String cpf = leitor.nextLine();
        PessoaFisica contaPoupanca1 = new PessoaFisica(nome, senha, cpf);
        System.out.println("Conta criada com sucesso!");
    }
}
