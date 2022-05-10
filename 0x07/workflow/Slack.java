
public class Slack implements CanalNotificacao{

    @Override
    public String notificar(Mensagem mensagem) {
        return "[SLACK] {" + TipoMensagem.LOG + "} - " + mensagem.getTexto() + "";
    }
}
