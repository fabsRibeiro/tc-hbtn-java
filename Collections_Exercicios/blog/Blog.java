
import java.util.*;

public class Blog {

    ArrayList<Post> postagens = new ArrayList<>();

    public void adicionarPostagem(Post post){
        postagens.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet();
        for(Post pots : postagens){
            autores.add(pots.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contagem = new TreeMap();
        int devOps = 0;
        int dev = 0;
        for(Post post : postagens){
            if(post.getCategoria().equals("DevOps")){
                devOps += 1;
                if(devOps != 0){
                    contagem.put(post.getCategoria(), devOps);
                }
            } else if(post.getCategoria().equals("Desenvolvimento")){
                dev += 1;
                if(dev != 0){
                    contagem.put(post.getCategoria(), dev);
                }
            }
        }
        return contagem; //treemap
    }
}
