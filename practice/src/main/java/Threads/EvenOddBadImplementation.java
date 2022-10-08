package Threads;

public class EvenOddBadImplementation implements Runnable {

    Boolean odd ;
    Boolean even ;

    @Override
    public void run() {
        evenNums();
        oddNums();
    }

    private  synchronized void oddNums() {
        for(int i =1;i<10 && odd;i+=2){
            System.out.println(i);
        }
    }

    private synchronized void evenNums() {
        for(int i =2;i<=10 && even ;i+=2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        EvenOddBadImplementation eo = new EvenOddBadImplementation();
        Thread t1 = new Thread(eo);
        Thread t2 = new Thread(eo);
        t1.run();
        t2.run();
    }
}
