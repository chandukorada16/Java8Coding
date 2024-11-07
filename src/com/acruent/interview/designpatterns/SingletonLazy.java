package com.acruent.interview.designpatterns;

public class SingletonLazy {

    public static SingletonLazy se=null;

    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(se==null){
            se=new SingletonLazy();
        }
        return se;
    }
}
class Test{
    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1.hashCode());

        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance2.hashCode());

        SingletonLazy instance3 = SingletonLazy.getInstance();
        System.out.println(instance3.hashCode());
    }
}
