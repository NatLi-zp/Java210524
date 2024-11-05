package de.telran.module_6.lesson_28.homework_051124.task1_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FixCodeAnnotation {
    String name() default "Гордиенко Наталья";
    String comment();

}
