package module_4.lesson_15;

public class MainException {
    public static void main(String[] args) throws UserCheckedException {
        try {
            m1(); //checked Exception
        } catch (InterruptedException e) {
            System.out.println("Проблема с работой sleep"); // системное исключение
        } catch (IllegalArgumentException e) {
            System.out.println("В m3 должен быть положит.");
        } catch (Exception ex) {
            System.out.println("Какое-то др. исключение");
        }

        try {
            // работа с пользоват. исключениями
            System.out.println(div(-4, 4));
        } catch (UserCheckedException ex) {
            System.out.println(ex.toString());
        } catch (UserUncheckedException ex) {
            System.out.println(ex.toString());
        }

        try {
            System.out.println(add(5, "hhh"));
        } catch (NumberFormatException ex){
            System.out.println("2й параметр в ADD д. б. числом!");
        } catch (RuntimeException ex){
            Throwable cause = ex.getCause();
            if (cause instanceof InterruptedException){
                System.out.println("Проблема с остановкой!");
            }
            if (cause instanceof UserCheckedException){
                UserCheckedException exception = (UserCheckedException) cause;
                System.out.println(exception.toString());
            }
        } finally {
            System.out.println("Этот блок кода будет выполняться ВСЕГДА");
        }



        System.out.println("========== MAIN  завершился корректно");


    }

    static void m1() throws InterruptedException {
        System.out.println("+ Вызван m1");
        m2();
        System.out.println("- Закончен m1");
    }

    static void m2() throws InterruptedException {
        System.out.println("++ Вызван m2");
        m3(-3);
        System.out.println("-- Закончен m2");
    }

    static void m3(int val) throws InterruptedException {
        System.out.println("+++ Вызван m3");
        Thread.sleep(1000); // порождает checked InterruptedException
        if (val < 0) throw new IllegalArgumentException("значение меньше 0"); //unchecked Exception
        System.out.println("--- Закончен m3");
    }

    public static int div(int v1, int v2) throws UserCheckedException {
        //  if (v1 <= 0) throw new IllegalArgumentException("Аргумент д. б. положит.")
        if (v1 <= 0) throw new UserCheckedException(" 1й аргумент не положитилельный", 1001);
        if (v2 > 0) throw new UserUncheckedException(" 2й аргумент положитилельный", 1002);
        int res = 0;
        try {
            res = v1 / v2;

        } catch (ArithmeticException ex) {
            System.out.println("2й аргумент в DIV не должен быть 0");
        }
        return res;
    }

    public static int add(int v1, String v2)  {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e); //преобразование checked в unchecked
        }

        try {
            verify(v1);
        } catch (UserCheckedException e) {
            throw new RuntimeException(e);
        }
        int res = 0;
        res = v1 + Integer.parseInt(v2);
        return res;
    }

    private static boolean verify(int v1) throws UserCheckedException {
        if (v1 < 0 ) throw  new UserCheckedException("в ADD 1й пар-р отрицательный", 1011);
        return true;
    }

}
