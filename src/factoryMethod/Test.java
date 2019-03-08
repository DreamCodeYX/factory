package factoryMethod;

public class Test {
    public static void main(String[] args) {
        CarFactory aodi = new AoDiFactory();
        aodi.runNow().run();


        CarFactory baoma = new BaoMaFactory();
        baoma.runNow().run();
    }
}
