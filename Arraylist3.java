import java.util.*;
public class Arraylist3{
    public static void main(String []arg) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        // for(String fruit:al)
        // System.out.println(fruit);
        System.out.println("Returning element "+al.get(1));
        // al.set(4,"Dates");
        al.set(2,"Dates");
        System.out.println(al.get(2));
    }
}