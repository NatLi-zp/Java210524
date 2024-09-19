package de.telran.practice_180924;

public class MainCafe {
    public static void main(String[] args) {
        Cafe mainCafe = new Cafe();
        mainCafe.dishToToQueue(DishType.SALAT);
        mainCafe.dishToToQueue(DishType.SOUP);

        mainCafe.getNextDish();
        System.out.println(mainCafe.getDishQueue());
        mainCafe.takeDishFromQueue();
        System.out.println(mainCafe.getDishQueue());

        mainCafe.takeDishFromQueue();
        System.out.println(mainCafe.getDishQueue());
     //   preparedProcess(mainCafe);
    }

    static void prepareSalat(Cafe cafe) {
        cafe.addIngridient("Редис");
        cafe.addIngridient("Помидор");
        cafe.addIngridient("Огурец");
    }

    static void prepareSoup(Cafe cafe) {
        cafe.addIngridient("Вода");
        cafe.addIngridient("Соль");
        cafe.addIngridient("Картофель");
    }

    static void preparedProcess(Cafe cafe) {
        while (cafe.getNextDish() != null) {
            DishType currentDish = cafe.takeDishFromQueue();
            if (currentDish.equals(DishType.SALAT)) {
                prepareSalat(cafe);
            } else if (currentDish.equals(DishType.SOUP)) {
                prepareSoup(cafe);
            } else {
                System.out.println("Блюдо не определено");
            }
        }
    }
}
