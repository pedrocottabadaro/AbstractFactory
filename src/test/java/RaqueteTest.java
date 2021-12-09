
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RaqueteTest {


    @Test
    void returnDadosSquash() {
        RaqueteFactory factory = new SquashFactory();
        Raquete raquete = new Raquete(factory);
        assertEquals("Raquete de Squash encordoada", raquete.getCorda());
        assertEquals("Overgrip de Squash colocado", raquete.getOvergrip());
    }
    @Test
    void returnDadosBadminton() {
        RaqueteFactory factory = new BadmintonFactory();
        Raquete raquete = new Raquete(factory);
        assertEquals("Raquete de Badminton encordoada", raquete.getCorda());
        assertEquals("OVergrip de Badminton colocado", raquete.getOvergrip());
    }





}
