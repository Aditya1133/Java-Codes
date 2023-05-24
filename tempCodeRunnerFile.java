import java.util.*;
public class LinkedList4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> ll= new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        int len=ll.size();
        int d=len/2;
        ll.remove(d);
        int z=sc.nextInt();
        ll.add(z);
    }
}