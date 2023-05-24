import java.util.*;
public class Arraylist5{
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
        al.add(2,"E");
        System.out.print(al);
    }
}