package bank.Threads;

/**
 * Created by Ania on 24.05.2017.
 */
public class OurThreads {

    int ourIter = 0;

    public void increase(String threadName) {
        synchronized (ourIter) {
            System.out.println("Thread: " + threadName + " our iter: " + ourIter);
            ourIter++;
        }
    }

    public static void main(String[] args) {
        OurThreads ourThreads = new OurThreads();

        int numThreads = 5;
        MyThread[] threads = new MyThread[numThreads];

}
        MyThread threadA = new MyThread("A", ourThreads);
        MyThread threadB = new MyThread("B", ourThreads);
        MyThread threadC = new MyThread("C", ourThreads);

        threadA.start();
        threadB.start();
        threadC.start();

    }
}

