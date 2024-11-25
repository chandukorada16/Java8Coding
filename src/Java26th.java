import java.util.*;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java26th {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 2, 4, 7, 5, 9, 6, 7, 7, 5);
        int[] array={8, 2, 4, 7, 5, 9, 6, 7, 7, 5};
        int[] arrayNum ={8, 2, 4, 7, 5, 9, 6, 7, 7, 5};
        int[] arr={9,6,6,6,1,8,2,6,7,9};
        int[] nums = {1, 2, 4, 5, 6};
        String s7="I am preparing myself for MNC’s and companies and MNC’s";
        String s5 = "I am preparing myself for MNC’s and companies";
        String s6 = "and Product based companies and MNC’s";
        String s1="I am preparing myself for MNC’s and Product based companies.";
        String aadhar="1234 9567 9101";
        String s = "ab12pq34";
        String inp="ChaNdU";
        String palindromeString="malayalam";
        int no=2;
        int inclusiveStart=10;
        int inclusiveEnd=99;
        List<Integer> cubeNum = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        List<Double> decimalNum = Arrays.asList(2.32, 11.53, 7.95, 1.23, 88.25, 35.25);
        int num=15623;
        String str="welcome to practicelab";
        String name="String";
        String input = "abbc";
        String string = "ab12pq34";
        String word="Java articles are Awesome";
        String word1="I am listener";
        String word2="am listener I";
        List<String> words=Arrays.asList("devarA","vara","tangam","Anvesh","Uva");
        List<String> backend = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<Integer> numbers = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
        List<List<Integer>> concatstreams = Arrays.asList(list, numbers);
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",30);
        map.put("Banana",15);
        map.put("Orange",20);
        map.put("Mango",10);
        System.out.println(removeDuplicatesList(list));
        System.out.println(removeDuplicatesArray(arrayNum));
        System.out.println(reverseOfName(name));
        System.out.println(frequencyofEachCharacter(input));
        System.out.println(numbersStartsWithOne(numbers));
        System.out.println(sumOfEvenNumebrs(numbers));
        System.out.println(sumOfOddNumebrs(numbers));
        System.out.println(findDuplicateElements(list));
        System.out.println(findWordsStartingWithVowels(words));
        System.out.println(findWordsEndingWithVowels(words));
        System.out.println(sortTheArrayInDesc(arrayNum));
        System.out.println(sortTheArrayInAsc(arrayNum));
        System.out.println(sumOfGivenString(string));
        System.out.println(firstElementInList(numbers));
        System.out.println(firstNonRepeatedCharacter(word));
        System.out.println(firstRepeatedCharacter(word));
        System.out.println(concatTwoStreams(concatstreams));
        System.out.println(concatTwoArrays(array,arrayNum));
        System.out.println(cubeAndMoreThan50(cubeNum));
        System.out.println(countOfEachCharacterInString(string));
        System.out.println(sortDecimalInRevOrder(decimalNum));
        System.out.println(joinTheStrings(words));
        int[] merge = mergedTwoSortedArrays(array, arrayNum);
        System.out.println(Arrays.toString(merge));
        int[] mergeDup = mergedTwoSortedArraysWithOutDuplicates(array, arrayNum);
        System.out.println(Arrays.toString(mergeDup));
        System.out.println(checkAnagrams(word1,word2));
        System.out.println(sumOfGivenNumber(num));
        System.out.println(increasingOrderBasedOnTheirLength(backend));
        System.out.println(decreasingOrderBasedOnTheirLength(backend));
        System.out.println(sumOfArrayIntegers(array));
        System.out.println(avgOfArrayIntegers(array));
        System.out.println(commonElementsInTwoArrays(array,arr));
        System.out.println(reverseEachWordOfString(word));
        System.out.println(sumOfFirstTenNaturalNumbers());
        int[] revOrd = reverseOfintegerArray(array);
        System.out.println(Arrays.toString(revOrd));
        System.out.println(firstTenEvennumbers());
        System.out.println(mostRepeatedInGivenArray(arr));
        System.out.println(checkPalindrome(palindromeString));
        System.out.println(fibonacciRange());
        System.out.println(firstTenOddnumbers());
        System.out.println(lastElementOfGivenArray(backend));
        printRandomNumbers(no,inclusiveStart,inclusiveEnd);
        System.out.println(findNamesLengthMorethanFive(backend));
        System.out.println(longestWordInGivenString(str));
        findOddAndEvenNumbersGivenList(list);
        System.out.println(findStringHavingLengthMoreThan5Chars(words));
        System.out.println(convertFirstCharacterToUpperCase(str));
        System.out.println(printStringWithLength(backend));
        calculateOperations(cubeNum);
        System.out.println(frequencyCombineAllOfGivenListOfStrings(backend));
        System.out.println(checkAadhar(aadhar));
        System.out.println(convertAllSmallCharactersIntoCapitalCharacters(inp));
        System.out.println(fitthLargestInGivenArray(array));
        System.out.println(sumOfDigitsInGivenString(s));
        System.out.println(findMissingNumber(nums));
        printCharctersPattern(s1);
        threeCharactersInEachLine(s1);
        System.out.println(combineStrings(str,s1));
        System.out.println(sortedOfTwoStrings(str,s1));
        System.out.println(commonUniqueWordsInTwoStrings(s5,s6));
        System.out.println(commonWordsInTwoStrings(s5,s6));
        System.out.println(printInReverseOrderBasedOnLength(s1));
        System.out.println(sortTheStringsAlphabetically(s1));
        System.out.println(numberOfRepeatedStrings(s7,no));
        System.out.println(sortTheHashMapByValues(map));
        System.out.println(sortTheHashMapByValuesInDesc(map));
        System.out.println(sortTheValuesInAsc(map));
        System.out.println(sortTheValuesInDesc(map));
    }
    private static List<Integer> removeDuplicatesList(List<Integer> list){
        List<Integer> uniqueList = list.stream()
                                    .distinct()
                                    .collect(Collectors.toList());
        return uniqueList;
    }
    private static List<Integer> removeDuplicatesArray(int[] array){
        List<Integer> uniqueArray = Arrays.stream(array)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        return uniqueArray;
    }
    private static String reverseOfName(String name){
        String rev = Arrays.stream(name.split(""))
                        .reduce((a, b) -> b + "" + a)
                        .get();
        return rev;
    }
    private static Map<Character,Long> frequencyofEachCharacter(String input){
        Map<Character, Long> frequencyOfEachCha = input.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequencyOfEachCha;
    }
    private static List<Integer> numbersStartsWithOne(List<Integer> numbers){
        List<Integer> startsWithOne = numbers.stream()
                .map(String::valueOf)
                .filter(num -> num.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        return startsWithOne;
    }
    private static Integer sumOfEvenNumebrs(List<Integer> numbers){
        Integer evenSum = numbers.stream()
                .filter(even -> even % 2 == 0)
                .reduce((a, b) -> a + b)
                .get();
        return evenSum;
    }
    private static Integer sumOfOddNumebrs(List<Integer> numbers){
        Integer oddSum = numbers.stream()
                .filter(even -> even % 2 == 1)
                .reduce((a, b) -> a + b)
                .get();
        return oddSum;
    }
    private static Set<Integer> findDuplicateElements(List<Integer> list){
       // Set<Integer> set=new HashSet<>();
       // List<Integer> duplicates = list.stream()
       //         .filter(i -> !set.add(i))
       //         .collect(Collectors.toList());
        Set<Integer> duplicates = list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
        return duplicates;
    }
    private static List<String> findWordsStartingWithVowels(List<String> words){
        List<String> startingVowels = words.stream()
                /*.filter(i -> i.startsWith("a")||i.startsWith("e")||i.startsWith("i")||i.startsWith("o")
                        ||i.startsWith("u") ||i.startsWith("A")||i.startsWith("E")||i.startsWith("I")
                        ||i.startsWith("O")||i.startsWith("U"))*/
                .filter(i->i.matches("^[aeiouAEIOU].*"))
                .collect(Collectors.toList());
        return startingVowels;
    }
    private static List<String> findWordsEndingWithVowels(List<String> words){
        List<String> endingVowels = words.stream()
                /*.filter(i -> i.endsWith("a")||i.endsWith("e")||i.endsWith("i")||i.endsWith("o")
                        ||i.endsWith("u") ||i.endsWith("A")||i.endsWith("E")||i.endsWith("I")
                        ||i.endsWith("O")||i.endsWith("U"))*/
                .filter(i->i.matches(".*[aeiouAEIOU]$"))
                .collect(Collectors.toList());
        return endingVowels;
    }
    private static List<Integer> sortTheArrayInDesc(int[] array){
        List<Integer> sortedInDesc = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                //.sorted(Collections.reverseOrder())
                //.sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());
        return sortedInDesc;
    }
    private static List<Integer> sortTheArrayInAsc(int[] array){
        List<Integer> sortedInAsc = Arrays.stream(array)
                .boxed()
                .sorted()
                //.sorted(Comparator.naturalOrder())
                //.sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());
        return sortedInAsc;
    }
    private static int sumOfGivenString(String string){
        int sumOfGivenString = string.chars()
                .filter(Character::isDigit)
                .map(i -> i - '0')
                .sum();
        return sumOfGivenString;
    }
    private static Integer firstElementInList(List<Integer> numbers){
        Integer firstElement = numbers.stream()
                .findFirst()
                .get();
        return firstElement;
    }
    private static Character firstNonRepeatedCharacter(String word){
        Character nonRepeatedCharacter = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        return nonRepeatedCharacter;
        /*for(Character ch:word.toCharArray()){
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                return ch;
            }
        }

        return null;*/
    }
    private static Character firstRepeatedCharacter(String word){
        Character repeatedCharacter = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        return repeatedCharacter;
    }
    private static List<Integer> concatTwoStreams(List<List<Integer>> concatstreams){
        List<Integer> concated = concatstreams.stream()
                .flatMap(i -> i.stream())
                .collect(Collectors.toList());
        return concated;

    }
    private static List<Integer> concatTwoArrays(int[] array,int[] arrayNum){
        List<Integer> concatArrays = IntStream.concat(Arrays.stream(array), Arrays.stream(arrayNum))
                .boxed()
                .collect(Collectors.toList());
        return concatArrays;
    }
    private static List<Integer> cubeAndMoreThan50(List<Integer> cubeNum){
        List<Integer> cubeMore = cubeNum.stream()
                .map(i -> i*i*i)
                .filter(i -> i > 50)
                .collect(Collectors.toList());
        return cubeMore;
    }
    private static long countOfEachCharacterInString(String string){
        long count = string.chars()
                .mapToObj(c -> (char) c)
                .count();
        return count;
    }
    private static List<Double> sortDecimalInRevOrder(List<Double> decimalNum){
        List<Double> revDec = decimalNum.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return revDec;
    }
    private static String joinTheStrings(List<String> words){
        String joinStrings = words.stream().collect(Collectors.joining(",", "[", "]"));
        return joinStrings;
    }
    private static int[] mergedTwoSortedArrays(int[] array,int[] arrayNum){
        int[] mergeArrays = IntStream.concat(Arrays.stream(array), Arrays.stream(arrayNum)).sorted().toArray();
        return mergeArrays;
    }
    private static int[] mergedTwoSortedArraysWithOutDuplicates(int[] array,int[] arrayNum){
        int[] mergeArraysWithoutDup = IntStream.concat(Arrays.stream(array), Arrays.stream(arrayNum)).distinct().sorted().toArray();
        return mergeArraysWithoutDup;
    }
    private static String checkAnagrams(String word1,String word2){
        word1 = Stream.of(word1.split(" ")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        word2 = Stream.of(word2.split(" ")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        if(word1.equals(word2)){
            return "Both are Anagrams";
        }else{
            return "Both are Not Anagrams";
        }
    }
    private static int sumOfGivenNumber(int num){
        int sum = String.valueOf(num).chars().map(c -> c - '0').sum();
        return sum;
    }

    private static List<String> increasingOrderBasedOnTheirLength(List<String> backend){
        List<String> increseLength = backend.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        return increseLength;

    }
    private static List<String> decreasingOrderBasedOnTheirLength(List<String> backend){
        List<String> decreaseLength = backend.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        return decreaseLength;

    }
    private static int sumOfArrayIntegers(int[] array){
        int sum = Arrays.stream(array).sum();
        return sum;
    }
    private static double avgOfArrayIntegers(int[] array){
        double avg = Arrays.stream(array).average().getAsDouble();
        return avg;
    }
    private static List<Integer> commonElementsInTwoArrays(int[] array,int[] arr){
        List<Integer> commonElements = IntStream.of(array)
                .filter(x -> IntStream.of(arr).anyMatch(y -> y == x))
                .boxed()
                .collect(Collectors.toList());
        return commonElements;
    }
    private static String reverseEachWordOfString(String word) {
       // String revWord = new StringBuilder(word).reverse().toString();
        String revWord = Arrays.stream(word.split("\\s+"))
                .map(i -> new StringBuilder(i).reverse().toString())
                .collect(Collectors.joining(" "));
        return revWord;
    }
    private static Integer sumOfFirstTenNaturalNumbers(){
        return IntStream.rangeClosed(1,10).sum();
    }
    private static int[] reverseOfintegerArray(int[] array){
        int[] revArray = IntStream.range(0, array.length)
                .map(i -> array[array.length - 1 - i])
                .toArray();
        return revArray;

    }
    private static List<Integer> firstTenEvennumbers(){
        List<Integer> firstTenEven = IntStream.iterate(2,n->n+2)
                .boxed()
                .limit(10)
                .collect(Collectors.toList());
        return firstTenEven;
    }
    private static Integer mostRepeatedInGivenArray(int[] arr){
        Integer mostRepeated = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .map(Map.Entry::getKey)
                .orElse(null);
        return mostRepeated;

    }
    private static String checkPalindrome(String palindromeString){
        boolean checkPalin = IntStream.range(0, palindromeString.length() / 2)
                .noneMatch(i -> palindromeString.charAt(i) != palindromeString.charAt(palindromeString.length() - i - 1));
        if(checkPalin){
            return "Given String Palindrome";
        }else{
            return "Given String is Not Palindrome";
        }

    }
    private static List<Integer> fibonacciRange(){
        List<Integer> range = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .collect(Collectors.toList());
        return range;
    }
    private static List<Integer> firstTenOddnumbers(){
        List<Integer> firstTenOdd = IntStream.iterate(1,n->n+2)
                .boxed()
                .limit(10)
                .collect(Collectors.toList());
        return firstTenOdd;
    }
    private static String lastElementOfGivenArray(List<String> backend){
        String lastElement = backend.stream().skip(backend.size() - 1).findFirst().get();
        return lastElement;
    }
    private static void printRandomNumbers(int no,int inclusiveStart,int inclusiveEnd){
        Random random = new Random();
        random.ints(no, inclusiveStart, inclusiveEnd).limit(no).forEach(System.out::println);
    }

    private static List<String> findNamesLengthMorethanFive(List<String> backend){
        List<String> names = backend.stream().filter(i -> i.length() > 5).collect(Collectors.toList());
        return names;
    }

    private static String longestWordInGivenString(String str){
        String longestWord = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        return longestWord;
    }
    
    private static void findOddAndEvenNumbersGivenList(List<Integer> list){
        Map<Boolean, List<Integer>> partion= list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 1));
        List<Integer> odd = partion.get(true);
        List<Integer> even = partion.get(false);
        System.out.println(odd);
        System.out.println(even);
    }

    private static List<String> findStringHavingLengthMoreThan5Chars(List<String> words){
        List<String> moreThan5Charcters = words.stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());
        return moreThan5Charcters;
    }

    private static String convertFirstCharacterToUpperCase(String str){
        String firstUpper = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
        return firstUpper;
    }

    private static List<String> printStringWithLength(List<String> backend){
        List<String> stringWithLength = backend.stream().map(str -> str + "=" + str.length()).collect(Collectors.toList());
        return stringWithLength;
    }

    private static void calculateOperations(List<Integer> cubeNum){
        /*IntSummaryStatistics statistics = cubeNum.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Min Num "+statistics.getMin());
        System.out.println("Max Num "+statistics.getMax());
        System.out.println("Avg "+statistics.getAverage());
        System.out.println("Sum "+statistics.getSum());
        System.out.println("Count "+statistics.getCount());*/
        int min = cubeNum.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = cubeNum.stream().mapToInt(Integer::intValue).max().getAsInt();
        double avg = cubeNum.stream().mapToInt(Integer::intValue).average().getAsDouble();
        int sum=cubeNum.stream().mapToInt(Integer::intValue).sum();
        long count= cubeNum.stream().mapToInt(Integer::intValue).count();
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println(sum);
        System.out.println(count);
    }

    private static Map<Character,Long> frequencyCombineAllOfGivenListOfStrings(List<String> backend){
        Map<Character, Long> frequency = backend.stream().flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequency;
    }

    private static String checkAadhar(String aadhar){
        if(aadhar.matches("[1-9][0-9]{3}[ ][0-9]{4}[ ][0-9]{4}")){
            return "Valid Aadhar";
        }else if(aadhar.matches("[1-9][0-9]{11}")){
            return "Valid Aadhar";
        }else{
            return "Not a Valid Aadhar";
        }
    }

    private static String convertAllSmallCharactersIntoCapitalCharacters(String inp){
        String s1="";
        for(int i=0;i<inp.length();i++){
            char ch=inp.charAt(i);
            if(ch>='a'&& ch<='z'){
                s1=s1+(char)(ch-32);
            }else if(ch>='A'&&ch<='Z'){
                s1=s1+(char)(ch+32);
            }else{
                s1=s1+ch;
            }
        }
        return s1;
    }

    private static Integer fitthLargestInGivenArray(int[] array){
        Integer fifth = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(4)
                .findFirst()
                .get();
        return fifth;
    }

    private static Integer sumOfDigitsInGivenString(String s){
        int sum = s.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0').sum();
        return sum;
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;  // n is the length of the array + 1 for the missing number
        int expectedSum = n * (n + 1) / 2;  // Sum of first n natural numbers

        // Use Stream API to calculate the actual sum of the elements in the array
        int actualSum = Arrays.stream(nums).sum();

        // The missing number is the difference between expected sum and actual sum
        return expectedSum - actualSum;
    }

    private static void printCharctersPattern(String s1){
        String combine = s1.replace(" ", "");

        int currentIndex = 0; // Start at the beginning of the combined string

        // Outer loop controls the chunk size (i)
        for (int i = 1; currentIndex < combine.length(); i++) {
            // Print i characters or until the end of the string
            for (int j = 0; j < i && currentIndex + j < combine.length(); j++) {
                System.out.print(combine.charAt(currentIndex + j));
            }
            System.out.println(); // Move to the next line
            currentIndex += i; // Advance to the next chunk
        }


    }

    private static void threeCharactersInEachLine(String s1){
        String combine = s1.replace(" ", "");
        // Iterate through the combined string in steps of 3 characters
        for (int i = 0; i < combine.length(); i += 3) {
            // Print 3 characters or the remaining characters
            for (int j = 0; j < 3 && i + j < combine.length(); j++) {
                System.out.print(combine.charAt(i + j));
            }
            System.out.println(); // Move to the next line
        }

    }

    private static List<String> combineStrings(String str,String s1){
        List<String> collect = Stream.of(str, s1).flatMap(s -> Arrays.stream(s.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());
        return collect;
    }

    private static List<String> sortedOfTwoStrings(String str,String s1){
        List<String> sortedString = Stream.of(str, s1)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(String::toLowerCase)
                .sorted().collect(Collectors.toList());
        return sortedString;
    }

    private static Set<String> commonUniqueWordsInTwoStrings(String s5,String s6){
        Set<String> commonWords = Arrays.stream(s5.split(" "))
                .map(String::toLowerCase) // Normalize case
                .filter(word -> Arrays.stream(s6.split(" "))
                        .map(String::toLowerCase)
                        .collect(Collectors.toSet())
                        .contains(word)) // Retain words that exist in s2
                .collect(Collectors.toSet());
        return commonWords;
    }

    private static List<String> commonWordsInTwoStrings(String s5,String s6){
        List<String> words1 = Arrays.stream(s5.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        List<String> words2 = Arrays.stream(s6.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // Find common words
        List<String> commonWords = words1.stream()
                .filter(words2::contains) // Retain words that are present in both lists
                .collect(Collectors.toList());
        return commonWords;
    }

    private static List<String> printInReverseOrderBasedOnLength(String s1){
        List<String> collect = Stream.of(s1.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        return collect;
    }

    private static List<String> sortTheStringsAlphabetically(String s1){
        List<String> collect = Stream.of(s1.split(" "))
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        return collect;
    }

    private static List<String> numberOfRepeatedStrings(String s7,int no){
        List<String> collect = Arrays.stream(s7.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == no)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        return collect;
    }

    private static  LinkedHashMap<String, Integer> sortTheHashMapByValues(Map<String,Integer> map){
        LinkedHashMap<String, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        return collect;
    }

    private static  Map<String, Integer> sortTheHashMapByValuesInDesc(Map<String,Integer> map){
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Handle duplicate keys (not expected here)
                        LinkedHashMap::new // Preserve insertion order
                ));
        return sortedMap;
    }

    private static Map<String,Integer> sortTheValuesInAsc(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }

    private static Map<String,Integer> sortTheValuesInDesc(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }










}
