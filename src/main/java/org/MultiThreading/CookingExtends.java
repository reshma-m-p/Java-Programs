package org.MultiThreading;

public class CookingExtends extends Thread {
    String task;
    public CookingExtends(String task){
        this.task=task;
    }

    @Override
    public void run() {
        System.out.println(task+" is prepared by chef "+currentThread().getName());
    }
}
class CookingExtendsMain{
    public static void main(String[] args) {
        CookingExtends pasta=new CookingExtends("Pasta");
        CookingExtends rice=new CookingExtends("Rice");
        CookingExtends noodle=new CookingExtends("Noodle");
        CookingExtends biriyani=new CookingExtends("Biriyani");
        CookingExtends tea=new CookingExtends("Tea");
        pasta.start();
        rice.start();
        noodle.start();
        biriyani.start();
        tea.start();

    }
}