
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String,Integer> contagemPalavras(String texto){
        String[] palavras = texto.split("\\ ");
        TreeMap<String,Integer> palavrasSeparadas = new TreeMap<String,Integer>();

        for(String palavra1 : palavras){
            palavra1 = palavra1.toLowerCase();
            palavra1 = palavra1.replaceAll("\\?", "");
            palavra1 = palavra1.replaceAll("\\.", "");
            palavra1 = palavra1.replaceAll("\\!", "");
            int contador = 0;

            for(String palavra2 : palavras){
                palavra2 = palavra2.toLowerCase();
                palavra2 = palavra2.replaceAll("\\?", "");
                palavra2 = palavra2.replaceAll("\\.", "");
                palavra2 = palavra2.replaceAll("\\!", "");
                if(palavra1.equalsIgnoreCase(palavra2)){
                    contador = contador + 1;
                    palavrasSeparadas.put(palavra1,contador);
                }
            }
        }
        return palavrasSeparadas;
    }
}
