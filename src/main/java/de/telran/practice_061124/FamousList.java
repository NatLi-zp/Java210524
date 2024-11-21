package de.telran.practice_061124;

//import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;


//@Setter
public class FamousList {

    public String name;
    //  private ArrayList<FamousList> famous;
    private FamousList[] famous;

    public FamousList(String name) {
        this.name = name;
    }

    public void setFamous(FamousList[] famous) {
        this.famous = famous;
    }

    public static FamousList getFamous(FamousList[] famous) {
        int first = 0;
        int last = famous.length - 1;

        while (first != last) {
//            System.out.println("11=" + famous[first]);
//            System.out.println("22=" + famous[last]);

            if (famous[first].isKnow(famous[last])) {
                first++;
            } else {
                last--;
            }
        }


        for (int i = 0; i < famous.length; i++) {
//            System.out.println("11=" + famous[first]);
//            System.out.println("22=" + famous[i]);
            //  if (i != first && (!famous[i].isKnow(famous[first]) || famous[first].isKnow(famous[i]))) {
            if (i != first && (!famous[i].isKnow(famous[first]) || famous[first].famous != null)) {
                return null;
            }
        }
        return famous[first];
    }


    private boolean isKnow(FamousList famous) {
//        if (this.famous.famous == famous) {

//        if (this.famous == famous) {
//            return true;
//        }
        return false;
    }


//    @Override
//    public String toString() {
//        return "FamousList{" +
//                "name='" + name + '\'' +
//                ", famous=" + Arrays.toString(famous) +
//                '}';
//    }


    public static void main(String[] args) {
        FamousList f1 = new FamousList("1");
        FamousList f2 = new FamousList("2");
        FamousList f3 = new FamousList("3");
        FamousList f4 = new FamousList("4");
        FamousList f5 = new FamousList("5");


        f1.setFamous(new FamousList[]{f2, f3});
        f2.setFamous(new FamousList[]{f3});
        f4.setFamous(new FamousList[]{f1, f3, f5});
        f5.setFamous(new FamousList[]{f3, f4});

        FamousList[] famouses = new FamousList[]{f1, f2, f3, f4, f5};

        //System.out.println(Arrays.toString(famouses));
        for (int i = 0; i < famouses.length; i++) {
            System.out.println(Arrays.toString(famouses[i].famous));
        }

        //System.out.println("Знаменитость = " + getFamous(famouses).name);
    }

}