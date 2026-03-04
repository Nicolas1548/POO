public class Veiculo {
    String  marca;
    int velocidadeMaxima;

public Veiculo(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;

}

void descricao() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
  }
}

class Moto extends Veiculo {
    String modelo; //

    public Moto() {
        super(marca, velocidadeMaxima);
        this.modelo = modelo;
    }

    void empinar(){
        System.out.println(modelo + "esta empinando.");
    }
}

