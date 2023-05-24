import java.util.*;
public class Arraylist6{
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        // Iterator itr=al.iterator();
        // while(itr.hasNext()){
        //     System.out.print(itr.next()+" ");
        // }
        System.out.print(al);
        ArrayList<String> al2= new ArrayList<String>();
        al2.add("E");
        al2.add("F");
        al2.add("G");
        al2.add("H");
        System.out.println(al2);
        al.addAll(al2);
        System.out.println("The array list after adding other arraylist items:- "+al);
        // al.retainAll(al2);
        // System.out.println("The array list after retaining other arraylist items:- "+al);
        al.remove("A");
        al.removeAll(al2);
        System.out.println("The array list after removing other arraylist items:- "+al);
        al.removeIf(str-> str.contains("D"));
        // System.out.println("The array list after removing item if it contains D:- "+al);
        // al.clear();
        System.out.println("The array list after clearing:- "+al);
        System.out.println(al.get(1));
        al.set(1,"I");
        System.out.println(al);
    } 
}