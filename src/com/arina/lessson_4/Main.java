package com.arina.lessson_4;

public class Main  {
    public static void main(String[] args) {
        Person student  = new Student();
        student.setAge(-9);
        System.out.println( student.getAge());
        student.setName("Никита");
        System.out.println( student.getName());
        student.setGender("мужчина");
        System.out.println( student.getGender());
    }
}
