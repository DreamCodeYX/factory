package simpleFactory;

public class Test {
    public static void main(String[] args) {
        CarFactory.getCar("宝马").run();
        CarFactory.getCar("奥迪").run();
    }
}
