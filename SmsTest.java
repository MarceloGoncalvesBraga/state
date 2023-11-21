package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmsTest {

    Sms msg;

    @BeforeEach
    public void setUp() {
        msg = new Sms();
    }

    // Sms

    @Test
    public void sendSms() {
        msg.setEstado(SmsEstadoPreparando.getInstance());
        assertFalse(msg.preparando());
    }

    @Test
    public void deveEnviarSms() {
        msg.setEstado(SmsEstadoEnviado.getInstance());
        assertEquals(msg.getInstance(), msg.getEstado());
    }

    @Test
    public void deveMostrarRecebido() {
        msg.setEstado(SmsEstadoRecebido.getInstance());
        assertEquals(SmsEstadoRecebido.getInstance(), msg.getEstado());
    }

}