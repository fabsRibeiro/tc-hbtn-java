

import java.util.*;

public class Biblioteca<T> {

    List<T> valores = new ArrayList<>();

    public void adicionarMidia(T valor){
        valores.add(valor);
    }

    public List<?> obterListaMidias(){
        return valores;
    }

}
