

public class FolhaPagamento {

    public static Double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculo){
        return calculo.calcular(funcionario.getSalario());
    }
}
