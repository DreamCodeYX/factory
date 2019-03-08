package simpleFactoryByClass;

public class CarFactory {
    public  static Car getCar(Class<? extends Car> clazz){
        if(clazz !=  null)
            try {
                return  clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        return null;
    }
}
