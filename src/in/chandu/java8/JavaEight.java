package in.chandu.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.*;

public class JavaEight {

        public static void main(String[] args) {
            String[] array = {"harsha", "chandu", "naveen", "pravs", "shiva","naveen","microservices","chad"};
            String name="ilovejavatechie";
            String tcs="Hello world! Namasthe india";
            String palin="malayalam";
            int[] numbers={5,9,11,2,8,121,1};
            int[] numbers1={5,9,11,2,8,121,1};
            int[] numbers2={8,1,4,3,8,8,7,3};
            int number=18;
            int[] mergedArray = mergedSortedArray(numbers1, numbers2);
            System.out.println(Arrays.toString(mergedArray));
            System.out.println(sortTheStrings(array));
            System.out.println(uniqueElementStrings(array));
            System.out.println(lengthOfEahArrayNames(array));
            System.out.println(occurenceOfEachCharcter(name));
            System.out.println(duplicatesOfGivenStringr(name));
            System.out.println(firstNonRepeatingCharcter(name));
            System.out.println(secondHighestGivenArray(numbers));
            System.out.println(longestStringInGivenString(array));
            System.out.println(startsWithOne(numbers));
            System.out.println(reverseOfString(tcs));
            System.out.println(reverseOfWords(tcs));
            System.out.println(reverseOfGivenString(name));
            System.out.println(reverseOfGivenStringInJava8(name));
            System.out.println(largestElementInGivenArray(numbers));
            System.out.println(checkPrime(number));
            printFibonacciSeries(number);
            System.out.println(checkPalindrome(palin));
            System.out.println(sumOfNumbers(number));
            System.out.println(countOfVowels(name));
            System.out.println(startsWithOne(array));
            System.out.println(stringisPresent(array));
            System.out.println(checkAnagram(name,palin));
            System.out.println(checkAnagramsInJava8(name,palin));



        }

        public static List<String> sortTheStrings(String[] array) {
            List<String> sorted= Arrays.stream(array).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            return sorted;

        }
        public static List<String> uniqueElementStrings(String[] array) {
            List<String> uniqueElements=Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry->entry.getValue()==1L)
                    .map(entry->entry.getKey())
                    .collect(Collectors.toList());
            return uniqueElements;

        }
        public static  List<Integer> lengthOfEahArrayNames(String[] array){
            List<Integer> collect = Arrays.stream(array).map(String::length).collect(Collectors.toList());
            return collect;


        }

        public static Map<Character,Long> occurenceOfEachCharcter(String name){
            Map<Character, Long> eachCharcterCount = name.chars()
                    .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            return eachCharcterCount;
        }
    public static List<Character> duplicatesOfGivenStringr(String name){
        List<Character> dupCharcters = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        return dupCharcters;
    }

    public static String firstNonRepeatingCharcter(String name){

        String firstNonRepeating = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        return firstNonRepeating;

    }
    public static Integer secondHighestGivenArray(int[] numbers){
        Integer secondHigh = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        return secondHigh;
    }
    
    public static String longestStringInGivenString(String[] array){
        String longestString = Arrays.stream(array)
                .reduce((a, b) -> a.length() > b.length() ? a : b)
                .get();
        return longestString;

    }
    public static List<String> startsWithOne(int[] numbers){
        List<String> startsWithString = Arrays.stream(numbers)
                .boxed()
                .map(i -> i + "")
                .filter(i -> i.startsWith("1"))
                .collect(Collectors.toList());
        return startsWithString;


    }
    public static String reverseOfString(String tcs){
        String rev = Arrays.stream(tcs.split(" ")).reduce((a, b) -> b + " " + a).get();
        return rev;
    }

    public static String reverseOfWords(String tcs){
        String string = new StringBuilder(tcs).reverse().toString();
        return  string;
    }

    public static String reverseOfGivenString(String name){
            String reverse="";
            for(int i=name.length()-1;i>=0;i--){
                reverse=reverse+name.charAt(i);
            }
            return reverse;
    }
    public static String reverseOfGivenStringInJava8(String name){
       return new StringBuffer(name).reverse().toString();
    }

    public static Integer largestElementInGivenArray(int[] numbers){
        Integer maxElement = Arrays.stream(numbers).boxed().max(Comparator.comparing(Integer::intValue)).get();
        return maxElement;
    }

    public static String checkPrime(int number){
            int fc=0;
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    fc++;
                }
            }
            if(fc==1){
                return "Prime Number";
            }else{
                return "Not a Prime Number";
            }
    }

    public static int[] mergedSortedArray(int[] numbers1,int[] numbers2) {
        int[] mergedArray = concat(Arrays.stream(numbers1), Arrays.stream(numbers2))
                .sorted().toArray();
        return mergedArray;

    }

    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static String checkPalindrome(String palin){
            String s1="";
            for (int i=palin.length()-1;i>=0;i--){
                s1=s1+palin.charAt(i);
            }
            if(palin.equals(s1)){
                return "Palindrome";
            }else{
                return "Not a Palindrome";
            }
    }

    public static Integer sumOfNumbers(int number){
        int sum = String.valueOf(number).chars().map(c -> c - '0').sum();
        return sum;
    }

    public static Long countOfVowels(String name){
        long count = name.chars().mapToObj(c -> (char) c)
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .count();
        return count;
    }

    public static List<String> startsWithOne(String[] array){
        List<String> startsWithStrings = Arrays.stream(array).filter(i -> i.startsWith("c")).collect(Collectors.toList());
        return startsWithStrings;
    }

    public static boolean stringisPresent(String[] array){
        boolean chandu = Arrays.stream(array).anyMatch(i -> i.equals("chandu"));
        return chandu;
    }

    public static String checkAnagram(String name,String palin){
            if(name.length()!=palin.length()){
                return "Both Strings are Not Anagrams";
            }else{
                char[] charArray1 = name.toLowerCase().toCharArray();
                char[] charArray2 = palin.toLowerCase().toCharArray();
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);
                boolean equals = Arrays.equals(charArray1, charArray2);
                if(equals){
                    return "Both strings are Palindrome";
                }else{
                    return "Both Strings are Not Anagrams";
                }
            }
    }

    public static String checkAnagramsInJava8(String name,String palin){
        String s1 = Stream.of(name.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
       String s2 = Stream.of(name.split("")).map(String::toLowerCase).collect(Collectors.joining());
        if(s1.equals(s2)){
            return "Both strings are Palindrome";
        }else{
            return "Both Strings are Not Anagrams";
        }
    }






}
