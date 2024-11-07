package in.chandu.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CvCorpArrays {
    public static void main(String[] args) {
        int[] input={2,2,2,4,3,1,4,5,5,6,7};
        int[] input1={100,3,7,7,4,8,3,2};
        int[] frequency = frequencyOfGivenArray(input);
        System.out.println(Arrays.toString(frequency));
        System.out.println(uniqueElementCountInGivenArray(input1));
        System.out.println(leastUniqueNumberInGivenArray(input1));
        System.out.println(mostRepeatedInGivenArray(input));
        System.out.println(countNumberOfDup(input));
        System.out.println(biggestElementOfArray(input));
        System.out.println(smallestElementOfArray(input));
        System.out.println(secondHighestElementOfArray(input1));
    }
    public static int[] frequencyOfGivenArray(int[] input){
        Map<Integer, Long> frequencyMap = Arrays.stream(input)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int[] result = Arrays.stream(input).map(i -> frequencyMap.get(i).intValue()).toArray();
        return result;
    }
    public static long uniqueElementCountInGivenArray(int[] input1){
        long count = Arrays.stream(input1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .count();

        return count;


    }

    public static Integer leastUniqueNumberInGivenArray(int[] input1){
        Integer leastUnique = Arrays.stream(input1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .sorted()
                .findFirst()
                .get();

        return leastUnique;


    }
    public static Integer mostRepeatedInGivenArray(int[] input){
        Integer repeatedNo = Arrays.stream(input)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .max(Comparator.reverseOrder()).get();

        return repeatedNo;


    }
    public static long countNumberOfDup(int[] input){
        long count = Arrays.stream(input)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
        return count;
    }
    public static Integer biggestElementOfArray(int[] input){
        Integer bigElement = Arrays.stream(input)
                            .boxed()
                            .max(Comparator.comparing(Integer::intValue)).get();
        return bigElement;
    }
    public static Integer smallestElementOfArray(int[] input){
        Integer smallElement = Arrays.stream(input)
                .boxed()
                .min(Comparator.comparing(Integer::intValue)).get();
        return smallElement;
    }
    public static Integer secondHighestElementOfArray(int[] input1){
        Integer secondHigh = Arrays.stream(input1)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        return secondHigh;
    }


}
