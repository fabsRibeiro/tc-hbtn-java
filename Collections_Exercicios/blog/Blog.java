
import java.util.*;

public class Blog {

    List<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post){
        posts.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet();
        for(Post pots : posts){
            autores.add(pots.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contagem = new TreeMap();
        int devOps = 0;
        int dev = 0;
        for(Post post : posts){
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
