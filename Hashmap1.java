import java.util.*;
import java.util.Map.Entry;
public class Hashmap1{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        System.out.println("The Maped array is :- "+map);
        System.out.println("The Maped array size is :- "+map.size());
        System.out.println("The Maped item at index 1 :- "+map.get(1));
        System.out.println("The Maped item at index 2 :- "+map.get(2));
        System.out.println("The Maped item at index 3 :- "+map.get("Two"));
        System.out.println();
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        System.out.println(map.containsValue("one"));
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
        map.remove(3);
        System.out.println(map);

        //you are not a skinny bitch copilot fuck u github
        map.clear();
        System.out.println(map.isEmpty());

    }
}