import Interacao.InteracaoInicial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        InteracaoInicial interacao = new InteracaoInicial();
        interacao.interacaoInicial(leitor);
        leitor.close();
    }
}