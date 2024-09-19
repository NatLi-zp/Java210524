package de.telran.module_2.lesson_9;

import java.util.*;

public class MainFly {
    public static void main(String[] args) {
        Fly fly1 = new Fly("Boeing", 1990, 900);
        Fly fly2 = new Fly("Ту-134", 1980, 600);
        Fly fly3 = new Fly("Airbus-300", 1990, 800);
        Fly fly4 = new Fly("Ил-200", 1989, 600);

        //  Set<Fly> flySetT = new TreeSet<>(Comparator.comparingInt(Fly::getYear));
        Set<Fly> flySetT = new TreeSet<>();
        flySetT.add(fly1);
        flySetT.add(fly2);
        flySetT.add(fly3); // теряется этот элемент как дубликат
        flySetT.add(fly4);
        System.out.println(flySetT);

        Set<Fly> flySetH = new HashSet<>();
        flySetH.add(fly1);
        flySetH.add(fly2);
        flySetH.add(fly3);
        flySetH.add(fly4);
        System.out.println("flySetH = " + flySetH);

        //flySetT.addAll(flySetH); // не добавятся как дубликаты
        Set<Fly> flySetT2 = new TreeSet<>(new SortFlyByName());
        flySetT2.addAll(flySetH);
        System.out.println("flySetT2 = " + flySetT2);

        // дубликаты не теряются
        List<Fly> list = new ArrayList<>();
        list.add(fly1);
        list.add(fly2);
        list.add(fly3);
        list.add(fly4);
        System.out.println(list);

        //list.sort(); // просит компаратор
        Collections.sort(list);
        System.out.println(list);

        // Компаратор был создан на основе именованного класса SortFlyByName
        Comparator<Fly> flyComparatorByName = new SortFlyByName();
        list.sort(flyComparatorByName); // отсортир по имени
        System.out.println("Sort по имени = " + list);

        // Компаратор был создан на основе анонимного класса , реализовав метод интерфейса
        Comparator<Fly> flyComparatorBySpeed = new Comparator<Fly>() {
            @Override
            public int compare(Fly o1, Fly o2) {
                if (o1.getSpeedMax() > o2.getSpeedMax()) return 1;
                else if (o1.getSpeedMax() < o2.getSpeedMax()) return -1;
                else return 0;
            }
        };
        list.sort(flyComparatorBySpeed); //(new Comparator<Fly>() {...})
        System.out.println("Sort по скорости = " + list);

        //сортируем по скорости, при совпадении сортируем еще и по году выпуска
        Comparator<Fly> flyComparatorBySpeedAndYear = new Comparator<Fly>() {
            @Override
            public int compare(Fly o1, Fly o2) {
                // сортировка по скорости
                if (o1.getSpeedMax() > o2.getSpeedMax()) return 1;
                else if (o1.getSpeedMax() < o2.getSpeedMax()) return -1;
                else {
                    // доп. сортировка по году
                    if (o1.getYear() > o2.getYear()) return 1;
                    else if (o1.getYear() < o2.getYear()) return -1;
                    else return 0;
                }
            }
        };

        //сортируем по скорости, при совпадении сортируем еще и по году выпуска в обратном порядке
        Comparator<Fly> flyComparatorBySpeedAndYearDesc = new Comparator<Fly>() {
            @Override
            public int compare(Fly o1, Fly o2) {
                // сортировка по скорости
                if (o1.getSpeedMax() > o2.getSpeedMax()) return 1;
                else if (o1.getSpeedMax() < o2.getSpeedMax()) return -1;
                else {
                    // доп. сортировка по году
                    if (o2.getYear() > o1.getYear()) return 1;
                    else if (o2.getYear() < o1.getYear()) return -1;
                    else return 0;
                }
            }
        };
        list.sort(flyComparatorBySpeedAndYear); //(new Comparator<Fly>() {...})
        System.out.println("Sort по скорости и году = " + list);

        list.sort(flyComparatorBySpeedAndYearDesc); //(new Comparator<Fly>() {...})
        System.out.println("Sort по скорости и году (в обратном порядке Год) = " + list);

        Comparator<Fly> flyComparatorBySpeedAndName = flyComparatorBySpeed.thenComparing((new SortFlyByName()).reversed());
        list.sort(flyComparatorBySpeedAndName);
        System.out.println("Sort по скорости и имени = " + list);

        // сортируем по скорости, при сопад. сортир еще и по имени (аналог вышеуказ. метода)
        Set<Fly> flySetTUseComparator = new TreeSet<>(flyComparatorBySpeedAndName);
        flySetTUseComparator.addAll(flySetH);
        System.out.println("Sort Set по скорости и имени = " + flySetTUseComparator);

    }
}
