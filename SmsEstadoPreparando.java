package padroescomportamentais.state;

public class SmsEstadoPreparando extends SmsEstado {

    private SmsEstadoPreparando() {};
    private static SmsEstadoPreparando instance = new SmsEstadoPreparando();
    public static SmsEstadoPreparando getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Preparando";
    }
    
    public boolean enviado(Sms sms) {
        sms.setEstado(SmsEstadoEnviado.getInstance());
        return true;
    }
}

