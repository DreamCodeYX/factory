package simpleFactoryByClass;

public class Test {
    public static void main(String[] args) {
        CarFactory.getCar(AoDiCar.class).run();
        CarFactory.getCar(BaoMaCar.class).run();
    }
}
