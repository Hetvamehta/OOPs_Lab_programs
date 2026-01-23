public class Time {
    int hours;
    int minutes;

    public void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    public void displayTime() {
        System.out.println(hours + " hours and " + minutes + " minutes");
    }

    public void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours + (minutes / 60);
        minutes = minutes % 60;
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.setTime(2, 45);

        Time t2 = new Time();
        t2.setTime(1, 30);

        Time t3 = new Time();
        t3.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();
        System.out.print("Total Time: ");
        t3.displayTime();
    }
}