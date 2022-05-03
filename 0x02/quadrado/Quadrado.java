public class Quadrado {
    public static double area(double lado){
        try {
            if(lado < 0) {
                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            }
        } catch (Exception e){
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return lado * lado;
    }
}
