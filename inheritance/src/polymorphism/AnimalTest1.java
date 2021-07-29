package polymorphism;

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("People move");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("Tiger move");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("Eagle move");
    }
}

public class AnimalTest1 {
    public static void main(String[] args){
        AnimalTest1 animalTest1 = new AnimalTest1();
        animalTest1.animalMove(new Human());
        animalTest1.animalMove(new Tiger());
        animalTest1.animalMove(new Eagle());
    }

    public void animalMove(Animal animal){
        animal.move();
    }
}