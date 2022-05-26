
import java.util.function.*;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkUp = 10;

    public Supplier<Double> precoComMarkUp = () -> getPreco() + getPreco() * (percentualMarkUp/100);

    public Consumer<Double> atualizarMarkUp = d -> percentualMarkUp = d;

    public Produto(double preco,String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
}
