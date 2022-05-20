

import java.util.*;

public class ListaTelefonica {

    public HashMap<String, HashSet<Telefone>> lista;

    public ListaTelefonica(){

        this.lista = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){
        if(lista.get(nome) == null){
            lista.put(nome, new HashSet<Telefone>());
        }

        lista.forEach((key, value) -> {
            if(value.contains(telefone)){
                if(key.equals(nome)){
                    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
                } else {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        });

        lista.get(nome).add(telefone); //lista.get(nome) =>> é a HashSet

        return lista.get(nome);  //retornando a lista HashSet<Telefone>
    }

    public HashSet<Telefone> buscar(String nome){
        return lista.get(nome);
    }
}