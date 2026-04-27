package Patterns.HashSet;

import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // add method
        set.add("apple");
        set.add("banana");
        set.add("apple");

        // contains
       Boolean val = set.contains("apple");
        Boolean val2 = set.contains("mango");
        System.out.println(val);
        System.out.println(val2);

//        for(String item : set){
//            System.out.println(item);
//        }

        set.forEach(item -> System.out.println(item));
    }
}
