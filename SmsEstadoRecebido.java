package padroescomportamentais.state;

public class SmsEstadoRecebido extends SmsEstado {

    private SmsEstadoRecebido() {};
    private static SmsEstadoRecebido instance = new SmsEstadoRecebido();
    public static SmsEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebido";
    }

}
