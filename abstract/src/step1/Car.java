package step1;

public abstract class Car {
    public abstract void refuel();
    public void stop(){
        System.out.println("차가 멈춥니다.");
    }

    public abstract void run();
}
