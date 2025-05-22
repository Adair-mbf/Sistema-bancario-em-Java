package Cliente;

public class PessoaFisica extends Pessoa {
    private String cpf;
    public PessoaFisica(String nome, String senha, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }
}
