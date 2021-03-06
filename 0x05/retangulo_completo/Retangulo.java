package retangulo_completo;

public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    @Override
    public double area(){
        double area = getLargura() * getAltura();
        return area;
    }

    public String toString(){
        return String.format("[Retangulo] %.2f / %.2f" , largura, altura );
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException{
        if(largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException{
        if(altura < 0){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }
}
