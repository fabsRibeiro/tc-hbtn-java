
public class ArmazemDeComida extends Armazem<Comida>{

    public void adicionarAoInventario(String nome, Comida valor) {
        super.adicionarAoInventario(nome, valor);
    }

    public Comida obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }
}
