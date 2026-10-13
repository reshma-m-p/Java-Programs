package org.MultiThreading;

public class SimpleThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Multi threading implements runnable interface");
    }
}
class SimpleThreadRunnableMain{
    public static void main(String[] args) {
        Thread thread=new Thread(new SimpleThreadRunnable());
        thread.start();
    }

}