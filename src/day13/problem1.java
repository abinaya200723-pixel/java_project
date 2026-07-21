package day13;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " Count: " + count);
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter, String name) {
        this.counter = counter;
        setName(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.increment();
        }
    }
}

public class problem1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter, "Thread-1");
        MyThread t2 = new MyThread(counter, "Thread-2");

        t1.start();
        t2.start();
    }
}
