public class Quadrado {
    public static double area(double lado){
        double resultado = 0;
        try {
            resultado = lado * lado;
            if(resultado  < 0){
                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            }
        } catch (Exception e){
            System.out.println();
        }
        return resultado;
    }
}
