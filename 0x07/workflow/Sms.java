

public class Sms implements CanalNotificacao {

    @Override
    public String notificar(Mensagem mensagem) {
        return "[SMS] {" + TipoMensagem.LOG + "} - " + mensagem.getTexto();
    }
}
