
import java.util.ArrayList;

public class ProcessadorVideo {

    ArrayList<CanalNotificacao> canais =  new ArrayList<>();

    public void registrarCanal(CanalNotificacao canalNotificacao){
            canais.add(canalNotificacao);
    }

    public void processar(Video video){
        String formato = video.getFormato().toString();

        Mensagem mensagem = new Mensagem();
        mensagem.setTexto(video.getArquivo() + " - " + formato);

        for(int i = 0 ; i < canais.size();i++) {
            System.out.println(canais.get(i).notificar(mensagem));
        }
    }
}
