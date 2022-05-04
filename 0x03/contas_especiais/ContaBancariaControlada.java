
import exceptions.*;

public class ContaBancariaControlada extends ContaBancariaBasica{

    public double saldoMinimo;
    public double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    public void aplicarAtualizacaoMensal() throws OperacaoInvalidaException {
        super.aplicarAtualizacaoMensal();
        if((saldo < saldoMinimo) || saldo < 1){
           saldo = saldo - valorPenalidade;
        }
    }
}
