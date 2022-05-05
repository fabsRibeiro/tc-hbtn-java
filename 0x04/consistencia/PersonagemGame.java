

public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

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
        saudeAtual = getSaudeAtual() + quantidadeDeCura;
        if(getSaudeAtual() > 100){
            setSaudeAtual(100);
        } else {
            setSaudeAtual(getSaudeAtual());
        }

        return saudeAtual;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if(getSaudeAtual() > 0){
            status = "vivo";
        }
        if(getSaudeAtual() <= 0){
            status = "morto";
        }
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null || nome != "");
        this.nome = getNome();
    }

    public String getStatus() {
        return status;
    }
}
