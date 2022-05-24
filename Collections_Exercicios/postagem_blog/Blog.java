
import java.util.*;

public class Blog {

    private List<Post> postagens;

    public Blog() {

        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        if(postagens.isEmpty()){
            postagens.add(post);
        } else{
            try{
                for(Post postagem : postagens){
                    if(postagem.getAutor().toString().equals(post.getAutor().toString()) && postagem.getTitulo().equals(post.getTitulo())){
                        throw new IllegalArgumentException();
                    }
                }
                postagens.add(post);
            } catch (IllegalArgumentException e){
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new HashSet<Autor>();
        postagens.stream().forEach(postagem->{
            autores.add(postagem.getAutor());
        });
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> contagem = new TreeMap<Categorias, Integer>();
        int devOps = 0;
        int dev = 0;
        int data_sc = 0;
        for(Post post : postagens){
            if(post.getCategoria().equals(Categorias.DEVOPS)){
                devOps += 1;
                if(devOps != 0){
                    contagem.put(Categorias.DEVOPS, devOps);
                }
            }
            if(post.getCategoria().equals(Categorias.DESENVOLVIMENTO)){
                dev += 1;
                if(dev != 0){
                    contagem.put(Categorias.DESENVOLVIMENTO, dev);
                }
            }
            if(post.getCategoria().equals(Categorias.DATA_SCIENCE)){
                data_sc += 1;
                if(data_sc != 0){
                    contagem.put(Categorias.DATA_SCIENCE, data_sc);
                }
            }
        }
        return contagem;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        HashSet<Post> categoriasPost = new HashSet<Post>();
        for(Post post : postagens){
            if(post.getCategoria().equals(categoria)){
                categoriasPost.add(post);
            }
        }
        TreeSet<Post> ordem = new TreeSet<Post>();
        categoriasPost.stream().forEach(post -> {
            ordem.add(post);
        });
        return ordem;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> mapPostsCategoria = new TreeMap<Categorias, Set<Post>>();
        for(Post post : postagens){
            mapPostsCategoria.put(post.getCategoria(), obterPostsPorCategoria(post.getCategoria()));
        }
        return mapPostsCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        TreeSet<Post> postagensAutor = new TreeSet<Post>();
        for(Post post : postagens){
            if(post.getAutor().toString().equals(autor.toString())){
                postagensAutor.add(post);
            }
        }
        return postagensAutor;
    }
    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> mapPostsAutor = new HashMap<Autor, Set<Post>>();
        for(Post post : postagens){
            mapPostsAutor.put(post.getAutor(), obterPostsPorAutor(post.getAutor()));
        }
        return mapPostsAutor;
    }
}
