package factoryMethod;

public class BaoMaFactory implements  CarFactory {
    @Override
    public Car runNow() {
        return  new BaoMaCar();
    }
}
