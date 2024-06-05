package com.example.program1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public static void main(String[] args) {
        launch();
    }{
        Integer[] A = {2, 4, 10, 11, 12};
        Object[] B = {30, 2, 4, 55, 80, "Hola", "Chao"};
        Object[] C = {2, 33, 55, "Hola"};

        System.out.println("PROGRAM TO GENERATE A SET");

        System.out.println("A = {2, 4, 10, 11, 12}");
        System.out.println("B = {30, 2, 4, 55, 80, \"Hola\", \"Chao\"}");
        System.out.println("C = {2, 33, 55, \"Hola\"}");

        Set<Object> onlyElements = new HashSet<>();

        for (Integer element : A) {
            onlyElements.add(element);
        }
        for (Object element : B) {
            onlyElements.add(element);
        }
        for (Object element : C) {
            onlyElements.add(element);
        }
        Set<Object> ElementsNonRepeated = new HashSet<>();

        for (Object element : onlyElements) {
            int count = 0;
            for (Integer integer : A) {
                if (element.equals(integer)) {
                    count++;
                }
            }
            for (Object object : B) {
                if (element.equals(object)) {
                    count++;
                }
            }
            for (Object object : C) {
                if (element.equals(object)) {
                    count++;
                }
            }
            if (count == 1) {
                ElementsNonRepeated.add(element);
            }
        }
        System.out.println("Elements that are not repeated:");
        for (Object element : ElementsNonRepeated) {
            System.out.println(element);
        }
    }
}