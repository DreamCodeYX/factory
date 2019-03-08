package simpleFactory;

public class CarFactory {
    public  static Car getCar(String  message){
        switch (message){
            case "宝马":  return  new BaoMaCar();
            case "奥迪": return new AoDiCar();
            default: return null;
        }
    }
}
