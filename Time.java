public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int h) {
        this.hour = h;
    }

    public void setMinute(int m) {
        this.minute = m;
    }

    public void setSecond(int s) {
        this.second = s;
    }

    public void setTime(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public void print() {
        System.out.print(hour + ":" + minute + ":" + second );
    }

    public static void main(String[] args) {
        Time t = new Time(0, 1, 59);
        t.print();  
    }
}