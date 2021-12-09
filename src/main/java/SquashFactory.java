public class SquashFactory implements RaqueteFactory{
    @Override
    public Overgrip createOvergrip() {
        return new OvergripSquash();
    }

    @Override
    public Corda createCorda() {
        return new CordaSquash();
    }
}
