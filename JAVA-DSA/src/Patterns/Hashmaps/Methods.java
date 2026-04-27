package Patterns.Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Methods {
    public static void main(String[] args) {
        // 1. put Method
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple" , 3);
        map.put("banana",5);
        map.put("Apple" , 10);
        // 2. get method
        int val = map.get("Apple");
//        System.out.println(val);
//        System.out.println(map);
        // 3. ContainsKey(Key);
        map.put("X" , 100);
        map.containsKey("X");
        map.containsKey("Y");
        if(map.containsKey("X")){
//            System.out.println(map.get("X"));
        }
        // 4.remove(Key)
       Integer removed = map.remove("X");
       Integer nothing = map.remove("Z");
//        System.out.println(removed);
//        System.out.println(nothing);

        // 5. size() and isEmpty()
       Integer Size = map.size();
       Boolean empty = map.isEmpty();
        System.out.println(Size);
        System.out.println(empty);

    }
}
