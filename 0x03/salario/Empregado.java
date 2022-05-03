
public class Empregado {

    public double salarioFixo;

    public Empregado (){

    }
    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta())){
            bonus = getSalarioFixo() * 0.10;
        }
        return bonus;
    }

    public double calcularSalarioTotal(Departamento departamento){
        double salario = getSalarioFixo() + calcularBonus(departamento);
        return salario;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
