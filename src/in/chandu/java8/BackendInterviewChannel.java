package in.chandu.java8;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BackendInterviewChannel {
    public static void main(String[] args) {
        int[] array={9,6,5,2,1,8,2,6,7,9};
        int[] array1={8,1,4,3,8,8,7,3,6,7};
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> listOfStrings = Arrays.asList("Devara","RRR","ASVR","JanathaGarage","NannakuPrematho","Temper");
        String pinNo="199P5@0115c";
        String string1="Chandu";
        String string2="chanDu";
        System.out.println(descendingOrderInGivenArray(array));
        System.out.println(sumOfGivenString(pinNo));
        System.out.println(reverseOfString(pinNo));
        System.out.println(FifthLargestNumeber(array));
        System.out.println(checkBothStringsAreIdentical(string1,string2));
        System.out.println(countMatching(pinNo));
        System.out.println(sumOfEvenGivenArray(array));
        System.out.println(sumOfOddGivenArray(array));
        System.out.println(duplicateElementsInArray(array));
        System.out.println(secondHighestInGivenArray(array));
        System.out.println(mergeTwoArraysAndPrintWithoutDup(array,array1));
        System.out.println(productOfIntegersInGivenList(integerList));
        System.out.println(lengthOfStrings(listOfStrings));
        System.out.println(sumOfSquaresOfIntegers(integerList));

    }
    public static List<Integer> descendingOrderInGivenArray(int[] array){
        List<Integer> descArray = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return descArray;
    }
    public static Integer sumOfGivenString(String pinNo){
        int sum = pinNo.chars().filter(Character::isDigit).map(c -> c - '0').sum();
        return sum;
    }
    public static String reverseOfString(String pinNo){
        String reverse = new StringBuilder(pinNo).reverse().toString();
        return reverse;
    }
    public static Integer FifthLargestNumeber(int[] array){
        Integer fifthLargest = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(4).findFirst().get();
        return fifthLargest;
    }
    public static String checkBothStringsAreIdentical(String string1,String string2){
        if(string1.equalsIgnoreCase(string2)){
            return "Both Strings are Identical";
        }else{
            return "Both Strings are Not Equal";
        }
    }
    public static long countMatching(String pinNo){
        /*long count=0;
        for (int i=0;i<pinNo.length();i++){
            if(pinNo.charAt(i)=='1'){
                count++;
            }
        }
        return count;*/
        long count = pinNo.chars().mapToObj(c -> (char) c).filter(c -> c == '1').count();
        return count;
    }

    public static Integer sumOfEvenGivenArray(int[] array){
        Integer evenSum = Arrays.stream(array).boxed().filter(even -> even % 2 == 0).reduce((a, b) -> a + b).get();
        return evenSum;

    }
    public static Integer sumOfOddGivenArray(int[] array){
        Integer oddSum = Arrays.stream(array).boxed().filter(even -> even % 2 == 1).reduce((a, b) -> a + b).get();
        return oddSum;

    }

    public static List<Integer> duplicateElementsInArray(int[] array){
        Set<Integer> set=new HashSet<>();
        List<Integer> duplicatesInArray = Arrays.stream(array).boxed().filter(i -> !set.add(i)).collect(Collectors.toList());
        return duplicatesInArray;
    }

    public static Integer secondHighestInGivenArray(int[] array){
        Integer secondHigh = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        return secondHigh;
    }

    public static List<Integer> mergeTwoArraysAndPrintWithoutDup(int[] array,int[] array1){
        List<Integer> mergeTwo = IntStream.concat(Arrays.stream(array), Arrays.stream(array1)).boxed().distinct().collect(Collectors.toList());
        return mergeTwo;
    }

    public static Integer productOfIntegersInGivenList(List<Integer> integerList){
        Integer product = integerList.stream().reduce((a, b) -> a * b).get();
        return product;
    }
    public static Map<Integer,List<String>>lengthOfStrings(List<String> listOfStrings ){
        Map<Integer, List<String>> lengthOfStr = listOfStrings.stream().collect(Collectors.groupingBy(String::length));
        return lengthOfStr;
    }
    public static Integer sumOfSquaresOfIntegers(List<Integer> integerList){
        Integer sumOfSquares = integerList.stream().map(i -> i * i).reduce((a, b) -> a + b).get();
        return sumOfSquares;
    }
    





}





