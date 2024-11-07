package in.chandu.java8;

import java.util.stream.IntStream;

public class StreamParallelStream {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(t->System.out.println(Thread.currentThread().getName()+t));
        IntStream.range(1,10).parallel().forEach(t->System.out.println(Thread.currentThread().getName()+" : "+t));
    }
}
