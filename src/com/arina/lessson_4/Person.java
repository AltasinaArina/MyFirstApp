package com.arina.lessson_4;

public class Person {
    private int age;
    private String name;
    private String gender;

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка!");
        }
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "Джон") {
            this.name = name;
        } else {
            System.out.println("Ошибка!");
        }
    }

    public  String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "мужчина") {
            this.gender = gender;
        } else {
            System.out.println("Ошибка!");
        }
    }
}
