//merging two linked list in java
import java.util.*;
public class Merge_Two_Lists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Enter the value in linked list one:- ");
        LinkedList<Integer> ls1=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            ls1.add(sc.nextInt());
        }
        System.out.println(ls1);
        System.out.println("Enter the value in linked list one:- ");
        LinkedList<Integer> ls2=new LinkedList<Integer>();
        for(int i=0;i<n2;i++){
            ls2.add(sc.nextInt());
        }
        System.out.println(ls2);
    if(ls1.size()>ls2.size()){
        LinkedList<Integer> ls3=new LinkedList<Integer>();
        for(int i=0;i<ls2.size();i++){
            int z=ls1.get(i);
            int q=ls2.get(i);
            ls3.add(z);
            ls3.add(q);
        }
        for(int i=ls2.size();i<ls1.size();i++){
            ls3.add(ls1.get(i));
        }
        System.out.print(ls3);
    }
    else{
        LinkedList<Integer> ls3=new LinkedList<Integer>();
        for(int i=0;i<ls1.size();i++){
            int z=ls1.get(i);
            int q=ls2.get(i);
            ls3.add(z);
            ls3.add(q);
        }
        for(int i=ls1.size();i<ls2.size();i++){
            ls3.add(ls2.get(i));
        }
        System.out.print(ls3);
    }
}
}
