import java.util.*;
public class Arraylist2{
    public static void main(String []arg) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}