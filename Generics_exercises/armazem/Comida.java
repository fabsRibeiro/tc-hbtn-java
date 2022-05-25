
import java.text.DecimalFormat;

public class Comida {

    private String nome;
    private int calorias;
    private Double preco;

    public Comida(String nome, int calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000000");
        String n = df.format(preco);
        Double ca = new Double(calorias);
        String c = df.format(ca);

        return String.format("[%s] %s R$ %s" , nome, c, n);
    }
}
