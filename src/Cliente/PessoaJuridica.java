package Cliente;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public PessoaJuridica(String nome, String senha, String cnpj) {
        this.nome = nome;
        this.senha = senha;
        this.cnpj = cnpj;
    }
}
