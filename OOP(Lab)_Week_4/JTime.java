class JTime {
    int hour, minute, second;

    JTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    JTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    JTime(int totalSeconds) {
        hour = totalSeconds / 3600;
        minute = (totalSeconds % 3600) / 60;
        second = totalSeconds % 60;
    }

    int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    int elapsedSeconds(JTime t) {
        return Math.abs(toSeconds() - t.toSeconds());
    }

    JTime elapsedTime(JTime t) {
        return new JTime(elapsedSeconds(t));
    }

    void display() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        JTime t1 = new JTime(9, 15, 30);
        JTime t2 = new JTime(17, 45, 10);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();

        System.out.println("Elapsed seconds: " + t1.elapsedSeconds(t2));

        JTime diff = t1.elapsedTime(t2);
        System.out.print("Elapsed time: ");
        diff.display();

        JTime t3 = new JTime(3725);
        System.out.print("3725 seconds = ");
        t3.display();
    }
}


