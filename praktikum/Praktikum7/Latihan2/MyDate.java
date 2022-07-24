package Praktikum.Praktikum7.Latihan2;

import java.util.GregorianCalendar;

class Mydate {
    private int Day;
    private int Month;
    private int Year;

    Mydate() {
        GregorianCalendar cal = new GregorianCalendar();
        Day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        Month = cal.get(GregorianCalendar.MONTH);
        Year = cal.get(GregorianCalendar.YEAR);
    }

    Mydate(int Day, int Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        Day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        Month = cal.get(GregorianCalendar.MONTH);
        Year = cal.get(GregorianCalendar.YEAR);
    }

    Mydate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }
}
