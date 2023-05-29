//write a program of HashMap
import java.util.*;
import java.io.*;
public class TestHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","b");
        map.put("c","d");
        map.put("e","f");
        map.put("g","h");
        map.put("i","j");
        map.put("k","l");
        System.out.println(map);
        map.remove("a");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.replace("c","X"));
        System.out.println(map);
        System.out.println(map.get("c"));
        System.out.println(map.get("X"));
        System.out.println(map.containsKey("k"));
        System.out.println(map.isEmpty());

        for(Map.Entry m : map.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.clear();
        System.out.println(map.isEmpty());

    }
}

