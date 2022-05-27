

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List filtrar(List<Produto> produtos, CriterioFiltro criterioFiltros){
        ArrayList<Produto> lista = new ArrayList<>();
        produtos.forEach(item ->{
            if(criterioFiltros.testar(item)){
                lista.add(item);
            }
        });

        return lista;
    }
}
