package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setNickname("Lucky");
        wolf.setWeight(15.6f);
        wolf.setAge(9);
        wolf.setColor("grey");

        System.out.println(wolf.getGender());
        System.out.println(wolf.getNickname());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
