

public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta())){
            bonus = (getSalarioFixo() * 0.20) + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01);
        }
        return bonus;
    }
}
