public class pra25 {
    static synchronized void printTable(String threadName, int num) {
        System.out.println("--- Table of " + num + " (" + threadName + ") ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printTable("Thread-1", 5));
        Thread t2 = new Thread(() -> printTable("Thread-2", 7));
        t1.start();
        t2.start();
    }
}
