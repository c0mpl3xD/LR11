public class Bird extends Animal implements Flyable{
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void fly() {
        System.out.println("Птиця літає");
    }
}
