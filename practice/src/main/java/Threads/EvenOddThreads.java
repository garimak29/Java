package Threads;

public class EvenOddThreads implements Runnable {
    int remainder;
    int number = 0;
    Object lock = new Object();
    EvenOddThreads(int remainder) {
        this.remainder = remainder;
    }

    public static void main(String[] args) {
        EvenOddThreads even = new EvenOddThreads(0);
        EvenOddThreads odd = new EvenOddThreads(1);

        Thread evenThread = new Thread(even, "Even Thread");
        Thread oddThread = new Thread(odd, "Odd Thread");

        evenThread.run();
        oddThread.run();


    }

    void printNumber() {
        System.out.println(number++);
    }

    @Override
    public void run() {
        while (number < 10){
            if(number %2 != remainder){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

            printNumber();
            lock.notifyAll();
        }

    }
}
