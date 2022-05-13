
import java.util.List;

public class ManipularArrayNumeros {


    public static int buscarPosicaoNumero(List<Integer> numeros, int numero){
        for(int i = 0; i < numeros.size(); i++){
            if(numero == numeros.get(i)){
                return i;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) {
        try {
            if(buscarPosicaoNumero(numeros, numero) != -1) {
                throw new Exception();
            } else {
                numeros.add(numero);
            }
        } catch (Exception e){
            System.out.println("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> numeros, int numero) {
        try {
            if(buscarPosicaoNumero(numeros, numero) == -1) {
                throw new Exception();
            }
            numeros.remove(buscarPosicaoNumero(numeros, numero));
        } catch (Exception e){
            System.out.println("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numero, int substituto) {
        if(buscarPosicaoNumero(numeros, numero) != -1){
            removerNumero(numeros, numero);
            numeros.add(substituto);
        } else {
            numeros.add(substituto);
        }
    }
}

