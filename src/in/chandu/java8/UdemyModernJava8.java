package in.chandu.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UdemyModernJava8 {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        List<Integer> numbers= Arrays.asList(6,2,8,1,0,1,9,6,8,1);
        System.out.println(sumOfNumbersBetweenOneToHundred(start,end));
        System.out.println(sumOfNumbersBetweenOneToHundredJava8(start,end));
        System.out.println(removeDuplicatesFromListOfIntegers(numbers));
        System.out.println(removeDuplicatesFromListOfIntegersImperative(numbers));
    }
    public static Integer sumOfNumbersBetweenOneToHundred(int start,int end){
        //imperative Approach
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static Integer sumOfNumbersBetweenOneToHundredJava8(int start,int end){
        //Declarative Approach
        int sum = IntStream.range(start, end+1).sum();
        return sum;
    }
    public static List<Integer> removeDuplicatesFromListOfIntegers(List<Integer> numbers){
        //Declarative Approach
        List<Integer> uniqueList = numbers.stream().distinct().collect(Collectors.toList());
        return uniqueList;

    }
    public static List<Integer> removeDuplicatesFromListOfIntegersImperative(List<Integer> numbers) {
        //Declarative Approach
        List<Integer> list = new ArrayList<>();
        for (Integer element : numbers) {

            // If this element is not present in newList
            // then add it
            if (!list.contains(element)) {

                list.add(element);
            }
        }
        return list;
    }
}
