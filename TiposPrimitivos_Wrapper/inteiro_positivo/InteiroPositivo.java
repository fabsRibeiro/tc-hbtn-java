

public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int numero) throws IllegalArgumentException{
        setValor(numero);
    }

    public InteiroPositivo(String opcao){
        Integer inter = Integer.parseInt(opcao);
        setValor(inter.intValue());
    }

    public Boolean ehPrimo(){
        if(getValor() % 2 != 0 && getValor() != 1){
            return true;
        }
        return false;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws IllegalArgumentException{
        try {
            if(valor <= 0){
                throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }
}
