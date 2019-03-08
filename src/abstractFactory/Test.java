package abstractFactory;

public class Test {
    public static void main(String[] args) {
        CarFactory aodi = new AodiFactory();
        aodi.runDrive().drive();
        aodi.runRetreat().retreat();


        CarFactory baoma = new BaoMaFactory();
        baoma.runDrive().drive();
        baoma.runRetreat().retreat();
    }
}
