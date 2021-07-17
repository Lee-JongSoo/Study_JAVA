package singleton;

public class Car {
    private static int serialNum = 10001;
    private int carID;

    public Car(){
        serialNum++;
        carID = serialNum;
    }

    public void setCarID(int carID){
        this.carID = carID;
    }

    public int getCarNum() {
        return carID;
    }
}
