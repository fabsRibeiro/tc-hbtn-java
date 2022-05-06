import produtos.*;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        ItemPedido[] itens = getItens();
        double valorTotal  = 0;

        for(int i = 0 ; i < getItens().length; i++){
            double valor = itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
            valorTotal = valorTotal + valor;
        }

        return valorTotal - (valorTotal * percentualDesconto/100);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }
    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        ItemPedido[] itens = getItens();
        String nomeProduto = null;
        String titulo = null;
        double preco = 0;
        int quantidade = 0;
        double total = 0;
        double valorDesconto = 0;
        double valorTotalProdutos = 0;

        for (int i = 0; i < getItens().length; i++) {
            nomeProduto = itens[i].getProduto().getClass().getName();
            titulo = itens[i].getProduto().getTitulo();
            preco = itens[i].getProduto().obterPrecoLiquido();
            quantidade = itens[i].getQuantidade();
            total = itens[i].getQuantidade() * preco;

            valorTotalProdutos = valorTotalProdutos + (itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade());

            if(getPercentualDesconto() > 0){
                valorDesconto = valorTotalProdutos*(getPercentualDesconto()/100);
            }

            if(nomeProduto.contains("Dvd")){
                nomeProduto = "Dvd";
            } else if (nomeProduto.contains("Livro")){
                nomeProduto = "Livro";
            }
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", nomeProduto, titulo, preco, quantidade, total);
        }

        System.out.println("----------------------------");
        System.out.printf("DESCONTO %.2f\n", valorDesconto);
        System.out.printf("TOTAL PRODUTOS %.2f\n", valorDesconto + calcularTotal());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO %.2f\n", calcularTotal());
        System.out.println("----------------------------");

    }
}
