package Conta;

import java.util.Scanner;

public class ContaEmpresarial extends Conta {
    double chequeEspecial = -2000;
    public void interacao(Scanner leitor){
        boolean ativadorLoop = true;
        do {
            System.out.println("Digite a operação que deseja realizar:\n1-Depósito\n2-Saque\n3-Transferência\n4-Ver Saldo\n5-Sair da conta");
            byte opcao = leitor.nextByte();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    saldo = deposito(leitor);
                    break;
                case 2:
                    saldo = saque(leitor);
                    break;
                case 3:
                    saldo = transferencia(leitor);
                    break;
                case 4:
                    System.out.printf("Saldo atual: R$%.2f\n",saldo);
                    break;
                case 5:
                    ativadorLoop = false;
                    break;
                default:
                    System.out.println("Operação invalida!");
                    break;
            }
        }while(ativadorLoop);
    }
    double deposito(Scanner leitor){
        System.out.println("Digite o valor que deseja depositar:");
        int valorDeposito = leitor.nextInt();
        return saldo + valorDeposito;
    }
    double saque(Scanner leitor){
        System.out.println("Digite o valor que deseja sacar:");
        int valorSaque = leitor.nextInt();
        if((saldo-valorSaque) < chequeEspecial) {
            System.out.println("Operação inválida!");
        }
        else{
            return saldo - valorSaque;
        }
        return saldo;
    }
    double transferencia(Scanner leitor){
        System.out.println("Digite o valor que deseja transferir:");
        int valorTransferencia = leitor.nextInt();
        System.out.println("Digite o número da conta para a qual deseja transferir:");
        String numeroConta = leitor.nextLine();
        System.out.println("Digite a agência da conta para a qual deseja transferir:");
        String agencia = leitor.nextLine();
        if((saldo-valorTransferencia) < chequeEspecial) {
            System.out.println("Operação inválida!");
        }
        else{
            return saldo - valorTransferencia;
        }
        return saldo;
    }
}
