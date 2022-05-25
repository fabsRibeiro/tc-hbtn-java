
import java.util.HashMap;

public abstract class Armazem<T> implements Armazenavel<T> {

    HashMap<String, T> lista = new HashMap<String, T>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        lista.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return lista.get(nome);
    }
}
