package singleton;

public class CarFactoryTest {
    public static void main(String[] args){
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createrCar();
        Car yourSonata = factory.createrCar();
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
