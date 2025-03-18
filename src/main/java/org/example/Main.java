package org.example;

import org.example.thread.MyThread;

public class Main  {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        System.out.println("Thread está NEW ");
        thread.start();// agora a Thread entra no estado RUNNABLE

        try {
            Thread.sleep(500);// Aguarda um pouco para observar os estados
            System.out.println(" Thread pode estar RUNNING ou em TIMED_WITTING... ");
            thread.join(); // Aguarda a finalização da thread
            System.out.println("Thread esta TERMINATED. ");
        }catch ( InterruptedException e){
            e.printStackTrace();


        }
    }
}