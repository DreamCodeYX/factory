package abstractFactory;

public class BaoMaFactory implements  CarFactory {
    @Override
    public Drive runDrive() {
        return new BaomaDrive();
    }

    @Override
    public Retreat runRetreat() {
        return new BaoMaRetreat();
    }
}
