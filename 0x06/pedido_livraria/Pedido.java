
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
}
