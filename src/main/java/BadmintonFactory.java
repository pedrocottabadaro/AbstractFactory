public class BadmintonFactory implements RaqueteFactory{
    @Override
    public Overgrip createOvergrip() {
        return new OvergripBadminton();
    }

    @Override
    public Corda createCorda() {
        return new CordaBadminton();
    }
}
