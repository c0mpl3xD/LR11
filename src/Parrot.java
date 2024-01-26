public class Parrot extends Bird implements Speakable{
    private String featherColors;
    public Parrot(String name, int age, String featherColors){
        super(name, age);
        this.featherColors = featherColors;
    }

    public String getFeatherColors() {
        return featherColors;
    }

    public void setFeatherColors(String featherColors) {
        this.featherColors = featherColors;
    }

    @Override
    public void speak() {
        System.out.println("Папуга говорить");
    }
}
