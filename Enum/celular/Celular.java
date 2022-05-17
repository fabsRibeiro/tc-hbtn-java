

import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos;
    private ArrayList<Contato> mantemContatos;

    public Celular() {
        contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nomeContato){
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nomeContato) || contatos.get(i).getNumeroDeTelefone().equals(nomeContato)){
                return i; //posição
            }
        }
        return -1; //Nao existe na listagem.
    }

    public void adicionarContato(Contato contato){
        try {
            if(obterPosicaoContato(contato.getNome()) == -1) {
                contatos.add(contato);
                mantemContatos = contatos;
            } else {
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if(contatos.isEmpty()){
            contatos = mantemContatos;
        }
        if((obterPosicaoContato(novoContato.getNome()) != -1) && (obterPosicaoContato(contatoAntigo.getNome()) != -1) &&
                obterPosicaoContato(novoContato.getNumeroDeTelefone()) != obterPosicaoContato(contatoAntigo.getNumeroDeTelefone())){
            contatos.get(obterPosicaoContato(contatoAntigo.getNome())).setNumeroDeTelefone(novoContato.getNumeroDeTelefone());
        } else {
            try{
                if(obterPosicaoContato(contatoAntigo.getNome()) == -1){ // -1 >> contato nao existe
                    contatos = new ArrayList<>();
                    throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
                }
                if(obterPosicaoContato(contatoAntigo.getNumeroDeTelefone()) == obterPosicaoContato(novoContato.getNumeroDeTelefone())) {
                    contatos = new ArrayList<>();
                    throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Nao foi possivel modificar contato. Contato nao existe");
            } catch (Exception e){
                System.out.println("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
        }
    }

    public void removerContato(Contato contato){
        if(contatos.isEmpty()){
            contatos = mantemContatos;
        }
        if(obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        } else {
            contatos.remove(contato);
        }
    }

    public void listarContatos(){
        for(Contato contato : contatos){
            System.out.println(contato.getNome() + " -> " + contato.getNumeroDeTelefone() + " (" + contato.getTipo() + ")");
        }
    }
}
