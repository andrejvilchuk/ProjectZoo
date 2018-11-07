package Animals;

public class Mammal extends Animal {
    private int pregnantPeriod = 4 ;

    public void period(){
        this.pregnantPeriod = pregnantPeriod;
    }

    public Mammal(String nickName, double size, int pregnantPeriod) {
        super(nickName, size);

    }

    public int getPregnantPeriod() {
        return  pregnantPeriod;
    }

    @Override
    public void say() {
        System.out.println("No sound found for mammal");
    }
}
