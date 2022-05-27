

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterioFiltros){
        ArrayList<Produto> lista = new ArrayList<>();
        produtos.forEach(item ->{
            if(criterioFiltros.test(item)){
                lista.add(item);
            }
        });

        return lista;
    }
}
