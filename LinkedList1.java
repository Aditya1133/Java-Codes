import java.util.*;
public class LinkedList1{
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        System.out.println(linkedList);
        linkedList.remove("A");
        System.out.println(linkedList);
        linkedList.addLast("W");
        linkedList.add(2,"Z");
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("W"));
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        System.out.println(l.indexOf(3));
        l.set(0,7);//replace at the index 
        System.out.println(l);
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
}
