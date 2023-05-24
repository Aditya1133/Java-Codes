import java.util.*;
public class list1{
    public static void main(String []arg) {
        List<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        Collections.sort(al);
        for(String fruit:al)
        System.out.println(fruit);



        System.out.println("Sorting Numbers...");

        List<Integer> list2=new ArrayList<Integer>();
        list2.add(5);
        list2.add(3);
        list2.add(76);
        list2.add(325);
        list2.add(4);
        Collections.sort(list2);
        for(Integer num:list2)
        System.out.println(num);
        

        // System.out.println("Returning element "+al.get(1));
        // // al.set(4,"Dates");
        // al.set(2,"Dates");
        // System.out.println(al.get(2));
    }
}