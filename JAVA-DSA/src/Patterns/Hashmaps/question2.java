package Patterns.Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class question2 {
    public static void main(String[] args) {
        String input = "aabbcccd";
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : input.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) +1);
        }
        for(char ch : input.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("First non-repeating : " + ch);
                break;
            }
        }
    }
}

