package arrayList;
import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args){
        ArrayList<Dog> dogArrayList = new ArrayList<>();
        dogArrayList.add(new Dog("a", "1"));
        dogArrayList.add(new Dog("b", "2"));
        dogArrayList.add(new Dog("c", "3"));
        dogArrayList.add(new Dog("d", "4"));
        dogArrayList.add(new Dog("e", "5"));

        for(Dog dogs : dogArrayList){
            System.out.println(dogs);
        }
    }
}
