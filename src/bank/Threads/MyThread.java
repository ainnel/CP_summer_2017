package bank.Threads;

import java.util.Iterator;

/**
 * Created by Ania on 24.05.2017.
 */
public class MyThread extends Thread {

    String name;
    private int iterator;
    private OurThreads ourThreads;

    public MyThread(String name, OurThreads ourThreads) {
        this.name = name;
        this.ourThreads = ourThreads;
    }

    @Override
    public void run() {
            while (iterator < 10) {
                try {
                    iterator++;
                    System.out.println(name + ": " + iterator);
                    this.sleep(10);
                }
                catch (InterruptedException e) {

                }
            }
        }
    }