import provedores;
public class Pedido {

    private int codigo;
    private int peso;
    private double total;
    private Frete frete;

    public Pedido(int codigo, int peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
