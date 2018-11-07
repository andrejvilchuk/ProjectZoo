package Animals;

public class Bird extends Animal {

    public Bird(String nickNaem,double size) {
        super(nickNaem,size);
    }

    @Override
    public void say() {
        System.out.println("Krya - Krya");;
    }
}
