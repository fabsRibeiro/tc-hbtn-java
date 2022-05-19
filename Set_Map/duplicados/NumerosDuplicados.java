
import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] inteiros){
        HashSet<Integer> semRepeticao = new HashSet<>();
        TreeSet<Integer> resultado = new TreeSet<>();

        for(int numero1 : inteiros) {
            semRepeticao.add(numero1);
        }
        for(int numero2 : semRepeticao){//[1, 2, 3, 5, 6, 7, 8, 9]
            int contador = 0;
            for(int numero3 : inteiros){ // {1, 2, 3, 1, 3, 2, 5, 8, 9, 6, 7, 6, 1, 2});
                if(numero3 == numero2){
                    contador = contador + 1;
                    if(contador > 1){
                        resultado.add(numero2);
                        contador = 0;
                    }
                }
            }
        }
        return resultado;
    }
}
