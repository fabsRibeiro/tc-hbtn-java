
import java.util.*;

public class Armazem<T> implements Armazenavel<T>{

    Map<String, T> lista = new HashMap<String, T>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        lista.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return lista.get(nome);
    }
}
