package Patterns.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(char ch  :  str1.toCharArray()){
            set1.add(ch);
        }
        for(char ch  :  str2.toCharArray()){
            set2.add(ch);
        }
        if(set1.equals(set2)){
            System.out.println("The given strings are anagrams");
        }else{
            System.out.println("The given string are not anagrams");
        }
    }
}
