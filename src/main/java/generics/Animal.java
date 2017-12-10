package generics;

import java.util.ArrayList;
import java.util.List;

class ParentAnimal {

}

public class Animal extends ParentAnimal{

}

class Cat extends Animal{}

class App1 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Object> parentAnimals = new ArrayList<>();


//        List<? extends Animal> animals = parentAnimals;
//        List<? super Animal> animals2 = parentAnimals;
//        animals2.add(new Cat());
//        animals2.add(new Animal());
//        animals2.add(new Object());
//        animals2.add(new ParentAnimal());
//        animals.addAll(cats);





//        List<Cat> cats = new ArrayList<>();
//        f(cats);


    }

    private static void f(List<? super Animal> animals) {
        Cat cat = new Cat();
        animals.add(cat);
        animals.add(new Animal());
//        animals.add(new ParentAnimal());
//        animals.add(new Object());
    }
}
