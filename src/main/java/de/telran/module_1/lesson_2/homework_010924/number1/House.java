package de.telran.module_1.lesson_2.homework_010924.number1;

public class House {
    Roof roof;
    Walls walls;
    Windows windows;
    Door door;
    Inhabitant[] inhabitants;

    public House() {
        this.roof = new Roof("зеленый", "надежная");
        System.out.println("У дома есть крыша " + roof.getRoof());

        this.walls = new Walls("желтый", "ровные", "гипсокартон");
        System.out.println("У дома есть стены " + walls.getWalls());

        this.windows = new Windows("металлопластик");
        System.out.println("У дома есть окна " + windows.getWindows());

        this.door = new Door("серый", "крепкая", "металл");
        System.out.println("У дома есть дверь " + door.getDoor());
    }

    public void initInhabitant(Inhabitant[] _inhabitants) {
        inhabitants = _inhabitants;
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i].getInhabitant();
        }

    }
}
