package com.syntax.class35;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileDemo {
    public static void main(String[] args) throws IOException {
        String path = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }
        scanner.close();
        FileWriter fileWriter = new FileWriter(path);
        

    }
}
