package Generic.hspedu.exe3;

public class MyDate implements Comparable<MyDate>{
    private int day;
    private int month;
    private int year;

    @Override
    public int compareTo(MyDate o) {
        int resultYear = year-o.getYear();
        if (resultYear != 0){
            return resultYear;
        }

        int resultMonth = month-o.getMonth();
        if (resultMonth != 0){
            return resultMonth;
        }

        return day-o.getDay();

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
