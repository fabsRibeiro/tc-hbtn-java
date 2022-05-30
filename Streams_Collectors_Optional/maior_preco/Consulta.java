

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){

        List<Produto> streamLista = pedido.getProdutos().stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                .collect(toList());

        return streamLista;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produto){

        Produto maiorValor = produto.stream()
                .min(Comparator.comparing(Produto::getPreco).reversed()).get();

        return maiorValor;
    }
}
