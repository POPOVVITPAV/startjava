package com.startjava.lesson_2_3.animal;

public class Wolf {
  
    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setWeight(float weight) {
        this.weight = weight; 
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Go-go-go");
    } 

    public void sit() {
        System.out.println(nickname + " cидит в кустах");
    }

    public void run () {
        System.out.println("Куда-то бежит");
    } 

    public void howl() {
        System.out.println("Воет на луну");
    } 

    public void hunt() {
        System.out.println(nickname + " охотиться");
    }
}
