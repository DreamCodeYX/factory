package factoryMethod;

public class AoDiFactory implements  CarFactory{
    @Override
    public Car runNow() {
       return new AoDiCar();
    }
}
