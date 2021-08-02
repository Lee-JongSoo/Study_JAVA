package polymorphism;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("People move");
    }
    public void readBook(){ System.out.println("Read books");}
}

class Tiger extends Animal{
    public void move(){
        System.out.println("Tiger move");
    }
    public void hunting(){System.out.println("Hunting");}
}

class Eagle extends Animal{
    public void move(){
        System.out.println("Eagle move");
    }
    public void flying(){System.out.println("Flying eagles");}
}

public class AnimalTest1 {
    ArrayList<Animal> animalArrayList = new ArrayList<Animal>();

    public static void main(String[] args){
        AnimalTest1 animalTest1 = new AnimalTest1();
        animalTest1.addAnimal();
        System.out.println("down casting");
        animalTest1.testCasting();
    }

    public void addAnimal(){
        animalArrayList.add(new Human());
        animalArrayList.add(new Tiger());
        animalArrayList.add(new Eagle());

        for(Animal ani : animalArrayList){
            ani.move();
        }
    }

    public void testCasting(){
        for(int i=0; i<animalArrayList.size(); i++){
            Animal animal = animalArrayList.get(i);
            if (animal instanceof Human){
                Human h = (Human)animal;
                h.readBook();
            }
            else if(animal instanceof Tiger){
                Tiger t = (Tiger)animal;
                t.hunting();
            }
            else if(animal instanceof Eagle){
                Eagle e = (Eagle)animal;
                e.flying();
            }
            else {
                System.out.println("No supplying");
            }
        }
    }
}