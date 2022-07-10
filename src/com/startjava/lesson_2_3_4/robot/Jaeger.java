package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String status;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int armor;
    private int kaijuKilled;
    private int pilots;

    public Jaeger() {

    }

    public Jaeger(String modelName, String status, String origin, float weight, int speed,int armor, int kaijuKilled, int pilots) {
        this.modelName = modelName;
        this.status = status;
        this.origin = origin;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
        this.kaijuKilled = kaijuKilled;
        this.pilots = pilots;
    }

    public String getModelName() {
      return modelName;
    }

    public void setModelName(String modelName) {
      this.modelName = modelName;
    }

    public String getMark() {
      return mark;
    }

    public void setMark(String mark) {
      this.mark = mark;
    }

    public String getStatus() {
      return status;
    }
    public void setStatus(String status) {
      this.status = status;
    }

    public String getOrigin() {
      return origin;
    }

    public void setOrigin(String origin) {
      this.origin = origin;
    }

    public float getHeight() {
      return height;
    }

    public void setHeight(float height) {
      this.height = height;
    }

    public float getWeight() {
      return weight;
    }

    public void setWeight(float weight) {
      this.weight = weight;
    }

    public int getSpeed() {
      return speed;
    }

    public void setSpeed(int speed) {
      this.speed = speed;
    }

    public int getArmor() {
      return armor;
    }

    public void setArmor(int armor) {
      this.armor = armor;
    }

    public int getKaijuKilled() {
      return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
      this.kaijuKilled = kaijuKilled;
    }

    public int getPilots() {
      return pilots;
    }

    public void setPilots(int pilots) {
      this.pilots = pilots;
    }

    public void move() {
        System.out.println(" Go - go - go");
    }

    public void drift() {
        if (2 == pilots || 3 == pilots) {
          System.out.println(" true");
        } else {
          System.out.println(" false");
        }
    }

    public void killKaiju() {
        System.out.format(" Number of killed Kaiju %d", ++kaijuKilled);
    }
}
