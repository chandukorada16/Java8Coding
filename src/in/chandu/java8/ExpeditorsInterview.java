package in.chandu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpeditorsInterview {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int target=6;
        int tar=1;
        List<List<String>> skills = Arrays.asList(
                Arrays.asList("Java", "Spring", "Spring Boot"),
                Arrays.asList("React", "Angular", "Java Script"),
                Arrays.asList("Mysql", "PlSql", "Oracle")
        );
        System.out.println(findIndexInGivenArray(array,target));
        System.out.println(findIndexInGivenArrayJava8(array,target));
        System.out.println(printMatches(array));
        System.out.println(combineSkills(skills));
        System.out.println(combineSkillsStartsWithS(skills));
        System.out.println(binarySearchOfGivenArray(array,tar));
    }
    public static int findIndexInGivenArray(int[] array,int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int findIndexInGivenArrayJava8(int[] array,int target){

        int asInt = IntStream.range(0, array.length)
                .filter(i -> array[i] == target)
                .findFirst()
                .getAsInt();
        return asInt;


    }
    public static List<Boolean> printMatches(int[] array){
        List<Boolean> collect = Arrays.stream(array)
                .boxed()
                .map(i -> i * i)
                .map(String::valueOf)
                .map(i -> i.contains("2"))
                .collect(Collectors.toList());
        return collect;

    }
    public static List<String> combineSkills(List<List<String>> skills){
        List<String> skillsList = skills.stream().flatMap(skil -> skil.stream()).sorted().collect(Collectors.toList());
        return skillsList;
    }
    public static List<String> combineSkillsStartsWithS(List<List<String>> skills){
        List<String> skillsList = skills.stream().flatMap(skil -> skil.stream()).filter(i->i.startsWith("S")).collect(Collectors.toList());
        return skillsList;
    }
    private static String binarySearchOfGivenArray(int[] array, int tar) {
        int s = 0, e = array.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (tar == array[m]) {
                return "Found";
            } else if (tar > array[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return "Not Found"; // Ensuring return if the target is not found
    }
}
