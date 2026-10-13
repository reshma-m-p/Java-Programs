package org.MultiThreading;

public class CountThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread "+Thread.currentThread().getName()+" with count "+i);
        }
    }
}
class CountThreadMain{
    public static void main(String[] args) {
        CountThread thread1=new CountThread();
        thread1.setName("Thread 1");
        CountThread thread2=new CountThread();
        thread2.setName("Thread 2");
        thread1.start();
        thread2.start();
    }
}