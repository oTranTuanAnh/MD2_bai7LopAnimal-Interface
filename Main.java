import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal anis: animals){
            System.out.println(anis.makeSound());
            if (anis instanceof Chicken){
                System.out.println(((Chicken) anis).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fr: fruits){
            System.out.println(fr.howToEat());
        }




    }
}
