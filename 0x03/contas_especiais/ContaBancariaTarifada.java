
import exceptions.*;

public class ContaBancariaTarifada extends ContaBancariaBasica{

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        if(getQuantidadeTransacoes() == 0){
            quantidadeTransacoes = getQuantidadeTransacoes() + 1;
        }
        saldo = saldo - (0.10 *  quantidadeTransacoes);
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        if(getQuantidadeTransacoes() == 0){
            quantidadeTransacoes = getQuantidadeTransacoes() + 1;
        }
        saldo = saldo - (0.10 * getQuantidadeTransacoes());
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
