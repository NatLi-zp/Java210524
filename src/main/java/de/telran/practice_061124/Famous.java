package de.telran.practice_061124;

//import lombok.Setter;

import java.util.Arrays;

//@Setter
public class Famous {

    public String name;
    private Famous famous;

    public Famous(String name) {
        this.name = name;
    }

    public void setFamous(Famous famous) {
        this.famous = famous;
    }

    public static Famous getFamous(Famous[] famous) {
        int first = 0;
        int last = famous.length - 1;

        while (first != last) {
            if (famous[first].isKnow(famous[last])) {
                first++;
            } else {
                last--;
            }
        }


        for (int i = 0; i < famous.length; i++) {
            if (i != first && (!famous[i].isKnow(famous[first]) || famous[first].isKnow(famous[i]))) {
                // if (i != first && (!famous[i].isKnow(famous[first]) || famous[first].famous != null)) {
                return null;
            }
        }
        return famous[first];
    }

    private boolean isKnow(Famous famous) {
        // if (this.famous.famous == famous) {
        if (this.famous == famous) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Famous{" +
                "name='" + name + '\'' +
                ", famous=" + famous +
                '}';
    }

    public static void main(String[] args) {
        Famous f1 = new Famous("1");
        Famous f2 = new Famous("2");
        Famous f3 = new Famous("3");
        Famous f4 = new Famous("4");
        Famous f5 = new Famous("5");

        f1.setFamous(f3);
        f2.setFamous(f3);
        f4.setFamous(f3);
        f5.setFamous(f3);

        Famous[] famouses = new Famous[]{f1, f2, f3, f4, f5};

        System.out.println(Arrays.toString(famouses));

        if (getFamous(famouses) != null) {
            System.out.println("Знаменитость = " + getFamous(famouses).name);
        } else {
            System.out.println("Знаменитости нет");
        }
    }
}