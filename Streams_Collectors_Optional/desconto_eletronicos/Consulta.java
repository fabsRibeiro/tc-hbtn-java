

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.mapping;
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

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){

        List<Pedido> listaPedido = pedidos.stream()
                .filter(pedido -> pedido.getProdutos().stream().anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO)).collect(toList());

        return listaPedido;
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos){

        produtos.stream()
                .filter(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
                .forEach(produto -> produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15));

        List<Produto> streamLista = produtos.stream().collect(toList());
        return streamLista;
    }
}
