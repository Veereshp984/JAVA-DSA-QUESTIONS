package Patterns.HashSet;

import java.awt.*;
import java.util.HashSet;

public class question2 {
    public static void main(String[] args) {
        String str = "aabbc";
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
       set.forEach((ch)-> System.out.println(ch));
    }
}
