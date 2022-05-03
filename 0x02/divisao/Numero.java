//package divisao;

public class Numero {
    public static void dividir(int a, int b){
        float c = 0;
/*        float d = (float) a;
        float e = (float) b;*/
        try{
            c = a/b;
        }
        catch (Exception ex) {
            System.out.println("Nao eh possivel dividir por zero");
        }
        finally {
            System.out.printf( a + " / " + b + " = %.0f \n", c);
        }
    }
}
