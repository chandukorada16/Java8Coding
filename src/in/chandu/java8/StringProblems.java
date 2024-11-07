package in.chandu.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringProblems {
    public static void main(String[] args) {
        String aadhar = "4398 7687 5869";
        String pan = "GDRPK8862E";
        String regNumber = "TS12BZ2154";
        String password = "Abcd@1234#";
        String palin = "RadaR";
        String inputString = "Hello World ThIs is jAAva";
        String inputString1 = "Hello World ThIs is jAAva@#";
        System.out.println(checkValidAadhar(aadhar));
        System.out.println(checkValidPan(pan));
        System.out.println(validRegNumber(regNumber));
        System.out.println(validPassword(password));
        System.out.println(checkPalindrome(palin));
        System.out.println(checkPalindromeJava8(palin));
        System.out.println(reverseOfEachWord(inputString));
        System.out.println(convertStringsSmallToCapital(inputString1));
        System.out.println(convertStringsSmallToCapitalAlternativePlaces(inputString1));
        System.out.println(printAlternativeCharcters(regNumber));

    }

    public static String checkValidAadhar(String aadhar) {
        if (aadhar.matches("[1-9][0-9]{3}[ ][0-9]{4}[ ][0-9]{4}")) {
            return "Valid Aadhar";
        } else if (aadhar.matches("[1-9][0-9]{11}")) {
            return "Valid Aadhar";
        } else {
            return "Invalid Aadhar";
        }
    }

    public static String checkValidPan(String pan) {
        if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
            return "Valid PAN";
        } else {
            return "Invalid PAN";
        }
    }

    public static String validRegNumber(String regNumber) {
        if (regNumber.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}")) {
            return "Valid Reg Number";
        } else {
            return "Invalid Reg Number";
        }
    }

    public static String validPassword(String password) {
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\s]).{9}$")) {
            return "Valid Password";
        } else {
            return "Invalid Password";
        }
    }

    public static String checkPalindrome(String palin) {
        String rev = new StringBuilder(palin).reverse().toString();
        if (palin.equals(rev)) {
            return "Palindrome";
        } else {
            return "Invalid Palindrome";
        }
    }

    public static String checkPalindromeJava8(String palin) {
        int length = palin.length();
        boolean b = IntStream.range(0, length / 2).allMatch(i -> palin.charAt(i) == palin.charAt(length - i - 1));
        if (b) {
            return "Palindrome";
        } else {
            return "Invalid Palindrome";
        }
    }

    public static String reverseOfEachWord(String inputString) {
        String reverseOfword = Stream.of(inputString.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        return reverseOfword;
    }
    public static String convertStringsSmallToCapital(String inputString1) {
        String s1="";
        for(int i=0;i<inputString1.length();i++) {
            char ch = inputString1.charAt(i);
            if(ch>='A' && ch<='Z'){
                s1=s1+(char)(ch+32);
            } else if (ch>='a' && ch<='z') {
                s1=s1+(char)(ch-32);
            }else{
                s1=s1+ch;
            }
        }
        return s1;

    }
    public static String convertStringsSmallToCapitalAlternativePlaces(String inputString1) {
        String s1="";
        for(int i=0;i<inputString1.length();i++) {
            char ch = inputString1.charAt(i);
            if(i%2==0) {
                if (ch >= 'A' && ch <= 'Z') {
                    s1 = s1 + (char) (ch + 32);
                } else if (ch >= 'a' && ch <= 'z') {
                    s1 = s1 + (char) (ch - 32);
                } else {
                    s1 = s1 + ch;
                }
            }
        }
        return s1;

    }
    public static List<Character> printAlternativeCharcters(String regNumber){
        List<Character> characterList = regNumber.chars().mapToObj(c -> (char) c).filter(c -> c.charValue()%2==1).collect(Collectors.toList());
        return characterList;


    }
}
