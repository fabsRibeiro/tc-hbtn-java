
import java.text.DecimalFormat;

public class Eletronico<T> {

    private String descricao;
    private T valor;

    public Eletronico(String descricao, T valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {

        this.valor = valor;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000000");
        String n = df.format(getValor());
        return String.format("[%s] R$ %s" , descricao, n);
    }
}
