public class DayType {
    private static final String[] Dayss = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private int day;
    public DayType(String d) {
        setDay(d);
    }

    public void setDay(String x) {
        if (x.equals("Sun")) day = 0;
        else if (x.equals("Mon")) day = 1;
        else if (x.equals("Tue")) day = 2;
        else if (x.equals("Wed")) day = 3;
        else if (x.equals("Thu")) day = 4;
        else if (x.equals("Fri")) day = 5;
        else if (x.equals("Sat")) day = 6;
        else day = 0;
    }

    public void print() {
        System.out.println(Dayss[day]);
    }
    public String getDay() {
        return Dayss[day];
    }
    public String nextDay() {
        return Dayss[(day + 1) % 7];
    }
    public String prevDay() {
        return Dayss[(day + 6) % 7];
    }
    public String addDays(int n) {
        return Dayss[(day + n) % 7];
    }

    public static void main(String[] args) {
        DayType mon = new DayType("Mon");
        DayType tue = new DayType("Tue");
        System.out.println("Today: "); mon.print();
        System.out.println("Next day: " + mon.nextDay());
        System.out.println("Mon + 1 = " + mon.addDays(1));
        System.out.println("Tue + 17 = " + tue.addDays(17));
        System.out.println( "Next day: " + tue.nextDay());
        System.out.println("Prev day: " + mon.prevDay());
    }
}

