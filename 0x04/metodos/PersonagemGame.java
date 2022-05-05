package metodos;
public class PersonagemGame {

    private int saudeAtual;
    private String nome;

    public int tomarDano(int quantidadeDeDano){
       saudeAtual = getSaudeAtual() - quantidadeDeDano;
       if(quantidadeDeDano > saudeAtual){
           setSaudeAtual(0);
       } else {
           setSaudeAtual(saudeAtual);
       }
       return saudeAtual;
    }

    public int receberCura(int quantidadeDeCura){
        setSaudeAtual(saudeAtual + quantidadeDeCura);
        if(saudeAtual >= 100){
            setSaudeAtual(100);
        } else {
            setSaudeAtual(quantidadeDeCura);
        }
        return saudeAtual;
    }


    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
