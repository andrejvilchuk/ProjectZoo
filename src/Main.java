import Animals.Animal;
import Animals.Bird;
import Animals.Mammal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Ted", 12);
        System.out.println(animal.getNickName());
        animal.say();

        Bird bird = new Bird("Kesha",4);
        System.out.println(bird.getNickName());
        bird.say();

        Mammal mammal = new Mammal("Henri", 5.8,4);
        System.out.println(mammal.getNickName()+ " " +mammal.getPregnantPeriod());
        mammal.say();
    }
}
