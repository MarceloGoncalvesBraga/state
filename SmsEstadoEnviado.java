package padroescomportamentais.state;

public class SmsEstadoEnviado extends SmsEstado {

    private SmsEstadoEnviado() {};
    private static SmsEstadoEnviado instance = new SmsEstadoEnviado();
    public static SmsEstadoEnviado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Enviado";
    }
     
}

