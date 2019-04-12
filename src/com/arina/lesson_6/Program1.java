package com.arina.lesson_6;

import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            String text = "Hello Gold!";
            writer.write(text);
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
    }
}
