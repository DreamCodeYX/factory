package abstractFactory;

public class AodiFactory implements  CarFactory {
    @Override
    public Drive runDrive() {
        return new AodiDrive();
    }

    @Override
    public Retreat runRetreat() {
        return new AoDiRetreat();
    }
}
