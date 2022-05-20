
import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    public HashMap<String, ArrayList<Telefone>> lista;

    public ListaTelefonica(){

        this.lista = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        if(lista.get(nome) == null){
            lista.put(nome, new ArrayList<Telefone>());
        }
        lista.get(nome).add(telefone);
    }

    public ArrayList<Telefone> buscar(String nome){
            return lista.get(nome);
    }
}