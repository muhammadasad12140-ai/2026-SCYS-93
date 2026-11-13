class Counter {
    private int val;
    private int limit;

    public Counter(int limit) {
        this.limit = limit;
        val = 0;
    }

    public void setVal(int v) {
        if (v >= 0 && v < limit) {
            val = v;
        }
    }

    public int getVal() {
        return val;
    }

    public void increment() {
        val++;
        if (val == limit) {
            val = 0;
        }
    }

    public String toString() {
        if (val < 10) {
            return "0" + val;
        }
        return "" + val;
    }
}

class DigitalTimer {
    private Counter hours = new Counter(24);
    private Counter minutes = new Counter(60);

    public DigitalTimer() {
    }

    public DigitalTimer(int h, int m) {
        set(h, m);
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    public void tick() {
        minutes.increment();
        if (minutes.getVal() == 0) {
            hours.increment();
        }
    }

    public void set(int h, int m) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60) {
            hours.setVal(h);
            minutes.setVal(m);
        } else {
            throw new IllegalArgumentException("Invalid time: " + h + ":" + m);
        }
    }
}

public class Lab6Task1 {
    public static void main(String[] args) {
        DigitalTimer t = new DigitalTimer(23, 58);

        for (int i = 0; i < 5; i++) {
            System.out.println(t);
            t.tick();
        }

        DigitalTimer start = new DigitalTimer();
        System.out.println("Default: " + start);

        try {
            t.set(25, 70);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}