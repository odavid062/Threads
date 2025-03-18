package org.example.thread;

public class MyThread extends Thread{
    public void run () {
        try {
            System.out.println("Thread em Running... ");
            Thread.sleep(2000); //coloca a thread em TIMED_WAITING
            System.out.println("Thread finalizada ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
        }


