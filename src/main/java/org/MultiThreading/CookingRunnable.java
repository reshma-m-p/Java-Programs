package org.MultiThreading;

public class CookingRunnable implements Runnable{
    String task;
    public CookingRunnable(String task){
        this.task=task;
    }
    @Override
    public void run() {
        System.out.println(task+" is prepared by chef "+ Thread.currentThread().getName());
    }
}
class CookingRunnableMain{
    public static void main(String[] args) {
        Thread soup=new Thread(new CookingRunnable("Soup"));
        Thread salad=new Thread(new CookingRunnable("Salad"));
        Thread burger=new Thread(new CookingRunnable("Burger"));
        Thread pizza=new Thread(new CookingRunnable("Pizza"));
        Thread smoothie=new Thread(new CookingRunnable("Smoothie"));
        soup.start();
        salad.start();
        burger.start();
        pizza.start();
        smoothie.start();


    }
}