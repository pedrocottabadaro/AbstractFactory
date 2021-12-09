public class Raquete {
    private Corda corda;
    private Overgrip overgrip;

    public Raquete(RaqueteFactory factory) {
        this.corda = factory.createCorda();
        this.overgrip = factory.createOvergrip();
    }

    public String getCorda() {
        return this.corda.encordoar();
    }

    public String getOvergrip() {
        return this.overgrip.trocar();
    }


}
