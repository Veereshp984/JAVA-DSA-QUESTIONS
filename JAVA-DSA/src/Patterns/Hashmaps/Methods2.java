package Patterns.Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Methods2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple" , 1);
        map.put("Banana" , 2);
        map.put("Veeru" , 3);
        map.put("Surag" , 4);
        map.put("Pajju" , 1);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        for(String key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }
        for(Integer value : map.values()){
            System.out.println(value);
        }

        map.forEach((key,value)->{
            System.out.println(key + "->" + value);
        });
    }
}
