public class Date {
    private int day;
    private String month;
    private int year;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Date: " + day + " - " + month + " - " + year;
    }
}