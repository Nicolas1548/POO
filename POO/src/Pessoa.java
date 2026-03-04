public class Pessoa {
    String nome;
    String profissao;
    int idade;

    void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " tenho " + idade + " anos e sou " + profissao + ".");
    }
}

void main(){
    Pessoa pessoa1 = new Pessoa();
    pessoa1.nome = "Nicolas";
    pessoa1.profissao = "Dev";
    pessoa1.idade = 23;

    Pessoa pessoa2 = new Pessoa();
    pessoa2.nome = "Alias";
    pessoa2.profissao = "Lash";
    pessoa2.idade = 22;

    pessoa1.apresentar();
    pessoa2.apresentar();
}
