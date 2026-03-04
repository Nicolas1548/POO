public class Produto {
    private String nome;
    private double preco;

    public Produto() {
        this.nome = nome;
        this.preco = preco;
}
public String getNome() {
        return nome;
    }
public double getPreco() {
    return preco;
}

public void aplicarDesconto(double percentual){
        if(percentual > 0 && percentual <=50) {
            double desconto = preco *(percentual / 100);
            preco = preco - desconto;
            System.out.println("Desconto aplicado! Novo preço: R$ " + preco );
        }else {
            System.out.println("Desconto inválido! O valor dever ser entre 1% a 50%.");
        }
    }
}

void main(){
    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 7500;

    System.out.println("Produto: " + p1.getNome());
    System.out.println("Preço: R$" + p1.getPreco());

    p1.aplicarDesconto(30);
    p1.aplicarDesconto(52);
}