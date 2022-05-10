
public class Loggi implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        if(peso > 5000){
            frete.setValor(valor * 0.12);
        } else {
            frete.setValor(valor * 0.04);
        }
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
