package com.kata.racemus.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static final String PATH_TO_FILE ="";
    public static void readLineByLine(){
        try {
            Scanner scanner = new Scanner(new File(PATH_TO_FILE));

            while (scanner.hasNextLine()) {
                Constants.addElementToLIST(scanner.nextLine());

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
