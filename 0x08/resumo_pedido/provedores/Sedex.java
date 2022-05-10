package provedores;
public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        if (peso > 1000) {
            frete.setValor(valor * 0.10);
        } else {
            frete.setValor(valor * 0.05);
        }
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
