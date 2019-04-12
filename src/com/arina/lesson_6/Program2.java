package com.arina.lesson_6;


import java.io.FileReader;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("notes3.txt")) {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
    }

}

