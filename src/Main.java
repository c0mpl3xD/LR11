public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Полі", 5,  "Зелене і жовте");
        Bat bat = new Bat("Батті", 3);

        // Виведення інформації про папугу
        System.out.println("Папуга:");
        System.out.println("Ім'я: " + parrot.getName());
        System.out.println("Вік: " + parrot.getAge());
        System.out.println("Кольори пір'я: " + parrot.getFeatherColors());
        parrot.fly();
        parrot.speak();
        System.out.println();

        // Виведення інформації про кажана
        System.out.println("Кажан:");
        System.out.println("Ім'я: " + bat.getName());
        System.out.println("Вік: " + bat.getAge());
        bat.fly();
        System.out.println();
    }
}