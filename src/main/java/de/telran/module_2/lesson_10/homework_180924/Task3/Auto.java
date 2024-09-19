
//крутила долго). Подозреваю, что работает не совсем верно и что нужно было делать неск. компараторов

package de.telran.module_2.lesson_10.homework_180924.Task3;

import java.util.Objects;

public class Auto implements Comparable<Auto> {
    private String name;
    private AutoType autoType;
    private boolean isPeakHour; // час пик
    private boolean isEmergency; // ЧП
    private int num; // номер в очереди

    public Auto(String name, AutoType autoType, boolean isPeakHour, boolean isEmergency, int num) {
        this.name = name;
        this.autoType = autoType;
        this.isPeakHour = isPeakHour;
        this.isEmergency = isEmergency;
        this.num = num;
    }


    @Override
    public int compareTo(Auto o) {
        if (o.autoType == this.autoType) {
            if (o.num < this.num) return 1;
            else return -1;
        } else if (o.autoType == AutoType.AMBULANCE ||
                ((o.autoType == AutoType.SPECIAL_TRANSPORT && o.isEmergency) && this.autoType != AutoType.AMBULANCE) ||
                ((o.autoType == AutoType.BUS && o.isPeakHour) && (this.autoType != AutoType.AMBULANCE) && (this.autoType != AutoType.SPECIAL_TRANSPORT || (this.autoType == AutoType.SPECIAL_TRANSPORT && !this.isEmergency))))// ||
            //   (o.autoType == AutoType.CAR && this.autoType != AutoType.AMBULANCE && this.autoType != AutoType.SPECIAL_TRANSPORT && !this.isEmergency))


            return 1;

        else return -1;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", autoType=" + autoType +
                ", isPeakHour=" + isPeakHour +
                ", isEmergency=" + isEmergency +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public AutoType getAutoType() {
        return autoType;
    }

    public boolean isPeakHour() {
        return isPeakHour;
    }

    public boolean isEmergency() {
        return isEmergency;
    }
}

