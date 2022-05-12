import humor.*;
import comida.*;

public class Personagem {

    private int pontosDeFelicidade;

    public Humor obterHumorAtual(){
        if(getPontosDeFelicidade() < -5){
            return new Irritado();
        } else if(getPontosDeFelicidade() >= -5 && getPontosDeFelicidade() <= 0){
            return new Triste();
        } else if(getPontosDeFelicidade() < 15 && getPontosDeFelicidade() >= 1){
            return new Feliz();
        }
        return new MuitoFeliz();
    }

    public void comer(Comida[] comida){
        Comida[] alimento = comida;
        for(int i = 0; i < alimento.length; i++) {
            setPontosDeFelicidade(getPontosDeFelicidade() + alimento[i].getPontosDeFelicidade());
        }
    }

    @Override
    public String toString() {
        return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
}
