package in.chandu.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RevisionBackEndInterviewQuestions {
    public static void main(String[] args) {
        int array[]={8,2,4,7,5,9,6,7,7,5};
        int[] arr={8, 6, 0, 4, 6, 4, 2, 7};
        int[] arr3 = {3, 2, 5, 7};
        int[] arr4 = {2, 3, 5, 7};
        String name="chandu";
        String str="Hello world";
        char ch='l';
        List<Integer> integerList = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
        String sentence="Devara Vara Tangam Baira";
        String word1="listen";
        String word2="silent";
        String s1="abcd";
        String s2="abad";
        String input="abbc";
        String s3 = "()[]{}";
        String s4 = "(]";
        System.out.println(removeDuplicatesInGivenArray(array));
        System.out.println(reverseOfString(name));
        System.out.println(reverseOfStringAnotherApproach(sentence));
        System.out.println(fifthLargestInGivenArray(array));
        System.out.println(checkBothStringsIdentical(word1,word2));
        System.out.println(countMatchingCharacters(s1,s2));
        System.out.println(frequencyOfEachCharacter(input));
        System.out.println(generateLargestNumber(arr));
        System.out.println("Is \"" + s3 + "\" valid? " + isValid(s3)); // true
        System.out.println("Is \"" + s4 + "\" valid? " + isValid(s4)); // false
        System.out.println(startsWithOneInList(integerList));
        System.out.println(findDuplicateElements(array));
        System.out.println(compareBothArrays(arr3,arr4));
        System.out.println(removeCharacter(str,ch));
    }
    public static List<Integer> removeDuplicatesInGivenArray(int array[]){
        List<Integer> removeDup = Arrays.stream(array).boxed().distinct().collect(Collectors.toList());
        return removeDup;
    }
    public static String reverseOfString(String name){
        String rev = new StringBuilder(name).reverse().toString();
        return rev;
    }
    public static String reverseOfStringAnotherApproach(String sentence){
        String rev1=Arrays.stream(sentence.split(" ")).map(i ->
                new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" "));
        return rev1;
    }
    public static Integer fifthLargestInGivenArray(int array[]){
        Integer fifthLarge = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(4).findFirst().get();
        return fifthLarge;
    }
    public static String checkBothStringsIdentical(String word1,String word2){
        Object[] array1 = Stream.of(word1.split("")).sorted().toArray();
        Object[] array2 = Stream.of(word2.split("")).sorted().toArray();
        if(Arrays.equals(array1,array2)){
            return "Both Strings are Identical";
        }else{
            return "Both Strings are Non-Identical";
        }
    }
    public static int countMatchingCharacters(String s1, String s2) {
        int count = 0;

        // Iterate through both strings up to the length of the shortest string
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static Map<Character,Long> frequencyOfEachCharacter(String input){
        Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequencyMap;
    }
    public static String generateLargestNumber(int[] arr) {
        // Sort the array in descending order
        List<Integer> genLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        // Concatenate sorted digits into a string
        StringBuilder largestNumber = new StringBuilder();
        for (int digit : genLargest) {
            largestNumber.append(digit);
        }

        return largestNumber.toString();
    }
    public static boolean isValid(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket
            else {
                // If the stack is empty or the bracket doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are matched
        return stack.isEmpty();
    }
    public static List<Integer> startsWithOneInList(List<Integer> integerList){
        List<Integer> startsWithOne = integerList.stream().map(String::valueOf).filter(i -> i.startsWith("1")).
                map(Integer::valueOf).
                collect(Collectors.toList());
        return startsWithOne;
    }
    public static List<Integer> findDuplicateElements(int array[]){
        Set<Integer> set=new HashSet<>();
        List<Integer> list = Arrays.stream(array).boxed().filter(i -> !set.add(i)).collect(Collectors.toList());
        return list;
    }
    public static String compareBothArrays(int[] arr3,int[] arr4){
        if(arr3.length!=arr4.length){
            return "Both Arrays are Different";
        }else{
            Arrays.sort(arr3);
            Arrays.sort(arr4);
            if(Arrays.equals(arr3,arr4)){
                return "Both Arrays are Equal";
            }else{
                return "Both Arrays are Different";
            }
        }
    }
    public static String removeCharacter(String str, char ch) {
        // Replace all occurrences of the character with an empty string
        return str.replace(Character.toString(ch), "");
    }




}