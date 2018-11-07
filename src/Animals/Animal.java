package Animals;

public class Animal {
   private String nickName;
   private double size;


    public Animal(String nickName,double size) {
        this.nickName = nickName;
        this.size = size;
    }

    public String getNickName() {
        return " Name: " +nickName + " ,Size: " + size + " ,PregnantPeriod: ";
    }


    public void say(){
    System.out.println("No sound found for animal");

}
}
