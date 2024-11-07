package in.chandu.java8;

import java.net.StandardSocketOptions;

@FunctionalInterface
public interface GooglePay {
    public double pay();
    default void scratchCard(){
        System.out.println("Scratch Card");
    }
    static void payment(){
        System.out.println("payment done");
    }
}
