package com.acruent.interview.designpatterns;

public class SingletonEager {
    public static SingletonEager se=new SingletonEager();
    private SingletonEager(){

    }
    public static SingletonEager getInstance(){
        return se;
    }
}
class Main{
    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1.hashCode());

        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println(instance2.hashCode());

        SingletonEager instance3 = SingletonEager.getInstance();
        System.out.println(instance3.hashCode());
    }
}