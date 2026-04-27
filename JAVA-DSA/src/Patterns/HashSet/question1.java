package Patterns.HashSet;

import java.util.HashSet;

public class question1 {
    public static void main(String[] args) {
        String str = "aabbc";
        int count  =0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(set.contains(ch)){
                System.out.println("Duplicate: " + ch);
            } else {
                set.add(ch);
                count++;
            }

        }
        System.out.println(count);
    }
}
