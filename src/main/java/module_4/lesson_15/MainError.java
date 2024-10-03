package module_4.lesson_15;

public class MainError {
    public static void main(String[] args) {

        // обрабатіваем ошибки через  вібрасіваемое значение из метода
        int res = div(4, 0);
        if (res == Integer.MIN_VALUE)
            System.out.println("2й параметр не корректен");
        else if (res == Integer.MIN_VALUE - 1)
            System.out.println("1й параметр не корректен");
        else
            System.out.println("res = " + res);

        // обрабатіваем ошибки через  вібрасіваемое значение
        try {
            res = divExc(4, 1);
            res = divExc(-4, 2);
        } catch (ArithmeticException ex) {
            System.out.println("2й параметр не корректен (Exception)");
            //    ex.printStackTrace();
            //  System.out.println(ex.toString());
        } catch (RuntimeException ex) {
            System.out.println("1й параметр должен быть положит. (Exception)");
        }
        System.out.println("====== программа завершается корректно ===");
    }

    // объявляем об ошибке через возвращаемое значение из метода - старый подход
    public static int div(int v1, int v2) {
        if (v2 == 0) return Integer.MIN_VALUE; //-1;  2й параметр = 0
        if (v1 <= 0) return Integer.MIN_VALUE - 1; //1й пар-р не положительный
        int res = v1 / v2;
        return res;
    }

    // объявляем об ошибке через выбрасываемое исключение - новый подход
    public static int divExc(int v1, int v2) {

        if (v1 <= 0) throw new RuntimeException("1й пар-р не положит."); //1й пар-р не положительный
        int res = v1 / v2;
        return res;
    }
}
