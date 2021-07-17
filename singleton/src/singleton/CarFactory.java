package singleton;

public class CarFactory {
    private static CarFactory instancce = new CarFactory();
    private CarFactory(){}

    public static CarFactory getInstance(){
        if(instancce == null){
            instancce = new CarFactory();
        }
        return instancce;
    }

    public Car createrCar() {
        Car car = new Car();
        return car;
    }
}
