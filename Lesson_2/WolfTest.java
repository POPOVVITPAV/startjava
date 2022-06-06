package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.nickname = "Lukky";
        wolf.weight = 15.6f;
        wolf.age = 8;
        wolf.color = "grey";

        System.out.println(wolf.gender);
        System.out.println(wolf.nickname);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
