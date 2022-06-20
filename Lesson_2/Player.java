package Lesson_2;

public class Player {

    private String name;
    private int num;

    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getNum() {
      return num;
    }

    public void setNum(int num) {
      this.num = num;
    }
}
