package com.startjava.lesson_2_3.person;

public class Person {
  
    String gender = "male"; 
    String name = "Ivan";
    float height = 1.7f; 
    float weight = 70; 
    int age = 33;

    void walk() {
        System.out.println("I'm walking");
    }

    String sit() {
        return "I'm sitting on a bench";
    } 

    void run() {
        System.out.println("I'm running");
    } 

    boolean talk() {
        return true;
    } 
    
    String learnJava() {
        return "I'm learning java";
    }
}
