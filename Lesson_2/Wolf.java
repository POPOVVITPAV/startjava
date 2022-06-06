package Lesson_2;

public class Wolf {
  
    String gender;
    String nickname;
    float weight;
    int age;
    String color;

    void walk() {
        System.out.println("Идет...");
    } 

    void sit() {
        System.out.println(nickname + " cидит в кустах");
    }

    void run () {
        System.out.println("Куда-то бежит");
    } 

    void howl() {
        System.out.println("Воет на луну");
    } 

    void hunt() {
        System.out.println(nickname + " охотиться");
    }
}
