

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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produto, int valor){

        List<Produto> streamLista = produto.stream()
                .filter(p -> p.getPreco() == valor || p.getPreco() > valor)
                .collect(toList());

        return streamLista;
    }

}
