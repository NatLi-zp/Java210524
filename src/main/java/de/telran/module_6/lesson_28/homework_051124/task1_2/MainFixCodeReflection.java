package de.telran.module_6.lesson_28.homework_051124.task1_2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainFixCodeReflection {
    public static void main(String[] args) {
        MainFixCodeAnnotation ma = new MainFixCodeAnnotation();

        Class clazz = ma.getClass();

        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(FixCodeAnnotation.class)) {
                System.out.println("Method: " + m.getName());

                FixCodeAnnotation annotation = m.getAnnotation(FixCodeAnnotation.class);
                System.out.println("Name = " + annotation.name());
                System.out.println("Comment = " + annotation.comment());
            }
        }

        System.out.println();
        for (Field f : clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(FixCodeAnnotation.class)) {
                System.out.println("Field: " + f.getName());

                FixCodeAnnotation annotation = f.getAnnotation(FixCodeAnnotation.class);
                System.out.println("Name = " + annotation.name());
                System.out.println("Comment = " + annotation.comment());
            }
        }

        System.out.println();
        if (clazz.isAnnotationPresent(FixCodeAnnotation.class)) {
            System.out.println("Class: " + clazz.getSimpleName());

            FixCodeAnnotation annotation = ma.getClass().getAnnotation(FixCodeAnnotation.class);
            System.out.println("Name = " + annotation.name());
            System.out.println("Comment = " + annotation.comment());
        }

    }
}
