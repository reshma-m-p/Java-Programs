package org.MultiThreading;

public class SimpleThreadExtend extends  Thread{
    @Override
    public void run() {
        System.out.println("From Thread method...");
    }
}
class SimpleThreadMain{
    public static void main(String[] args) {
        SimpleThreadExtend thread=new SimpleThreadExtend();
        thread.start();
    }
}