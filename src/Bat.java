public class Bat extends Mammal implements Flyable{
    public Bat(String name, int age){
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Кажан літає");
    }
}
