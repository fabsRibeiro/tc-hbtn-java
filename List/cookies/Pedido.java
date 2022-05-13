

import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie){
        cookies.add(cookie);
    }

    public int obterTotalCaixas(){
        int totalCaixa = 0;
        for(PedidoCookie cookie : cookies){
            totalCaixa = totalCaixa + cookie.getQuantidadeCaixas();
        }
        return totalCaixa;
    }

    public int removerSabor(String sabor){
        int removidos = 0;
        for(int i = 0; i < cookies.size(); i++){
            if(sabor.equals(cookies.get(i).getSabor())){
                removidos = removidos + cookies.get(i).getQuantidadeCaixas();
                cookies.remove(cookies.get(i));
            }
        }
        return removidos;
    }
}
