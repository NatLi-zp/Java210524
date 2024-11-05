package de.telran.module_6.lesson_28.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InstantiationException {
        // создаем объект для последующей проверки свойств
        Sample sample = new Sample();

        Class cls = sample.getClass(); // возвращаем ссылку на Class из конкретного объекта
        System.out.println("Имя класса (длинное) - " + cls.getName());
        System.out.println("Имя класса (короткое) - " + cls.getSimpleName());

        Constructor constructor = cls.getConstructor();
        System.out.println("Имя конструктора по умолчанию - " + constructor.getName());

        Constructor[] constructors = cls.getConstructors();
        for (Constructor constr : constructors) {
            System.out.println("Имя конструктора  - " + constr.getName());
        }

        System.out.println("Это публичные методы классов :");
        Method methPublic = cls.getMethod("methPublic");
        System.out.println("Нашли метод :" + methPublic.getName());

        //Публичные методы
        Method[] publicMethods = cls.getMethods();
        for (Method method : publicMethods) {
            System.out.println("public  метод - " + method.getName());
        }

        //Все методы
        Method[] allMethods = cls.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("метод - " + method.getName());
        }

        //Вызываем метод через Рефлексию
        methPublic = cls.getMethod("methPublic"); // публичный
        methPublic.invoke(sample); // запускаем метод

        //Вызываем метод через Рефлексию
        Method meth = cls.getDeclaredMethod("methPrivate"); // приватный
        meth.setAccessible(true); // просим доступ для private
        meth.invoke(sample);// запускаем метод

        //Вызываем метод с параметрами через Рефлексию
        meth = cls.getDeclaredMethod("methProtected", int.class); // приватный
        meth.invoke(sample, 25);// запускаем метод

        //Вызываем метод с 2 параметрами через Рефлексию
        meth = cls.getDeclaredMethod("methDefault", int.class, double.class); // приватный
        meth.invoke(sample, 25, 13.01);// запускаем метод

        //Вызываем метод с неизвестным количеством параметрами через Рефлексию
        System.out.println("Сумма = " + sample.methPublicVarArgs(1, 2, 3, 4, 5, 6)); // стандартный вызов

        // пока не работает
//        meth = cls.getMethod("methPublicVarArgs", int[].class); // приватный
//        meth.invoke(sample, 1, 2, 3, 4, 5, 6);// запускаем метод

        //---- Получаем перечень всех публичных характеристик класса
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());

        }

        System.out.println("Все характеристики");
        fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Field field = cls.getDeclaredField("priv");
        field.setAccessible(true); // открываем доступ для private
        System.out.println(field.getName() + " = " + field.get(sample));
        field.set(sample, "Я новый через рефлексию private");
        System.out.println(field.getName() + " = " + field.get(sample));
        field.setAccessible(false); // закрываем доступ

        //создание объекта класса с помощью Reflection
        Class clazz = Class.forName(Sample.class.getName());
        // Конструктор по умолчанию
        Sample sampleRefl = (Sample) clazz.getConstructor().newInstance();
        sampleRefl.methPublic();

        //Используем private конструктор с параметрами
        Class[] params = {String.class, String.class};
        constructor = clazz.getDeclaredConstructor(params);
        constructor.setAccessible(true);
        sampleRefl = (Sample) constructor.newInstance("arg1", "arg2");

        sampleRefl.methProtected(33);
    }
}
