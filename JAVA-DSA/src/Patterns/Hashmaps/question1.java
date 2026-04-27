package Patterns.Hashmaps;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Veeru" ,1);
        map.put("suru" , 2);
        map.put("pajju" , 3);

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                System.out.println(entry.getKey());
            }

        }
        int sum =0;
        for(Integer value : map.values()){
//            System.out.println(value);
            sum += value;
        }
        System.out.println(sum);
    }
}
