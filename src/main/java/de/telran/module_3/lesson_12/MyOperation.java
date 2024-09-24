package de.telran.module_3.lesson_12;

@FunctionalInterface
public interface MyOperation { // только один метод абстрактный
    int operation(int x, int y);

    // любое колво  методов с default реализацией
    default int sum (int x, int y){
        methodStatic(); // можем уже вызывать  статич методы, но не наоборот
        return x+y;
    }

    // любое колво статич. методов
    static  void methodStatic() {
        System.out.println("Я статический метод");
    }

}
