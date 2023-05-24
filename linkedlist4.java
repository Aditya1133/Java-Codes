import java.util.*;
public class linkedlist4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the linked list");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the linked list");

        LinkedList<Integer> ll= new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        System.out.println("Enter the length of the linked list");

        int k=sc.nextInt();
        System.out.println("Enter the elements of the linked list");
        LinkedList<Integer> ll2= new LinkedList<Integer>();
        for(int i=0;i<k;i++){
            ll2.add(sc.nextInt());
        }
        System.out.println(ll);
        int len=ll.size();
        int d=len/2;
        ll.remove(d);
        System.out.println("linked list after removing the middle elements:- ");

        System.out.println(ll);
        int z=sc.nextInt();
        ll.add(z);
        System.out.println("linked list after the adiing the elements:- ");
        System.out.println(ll);
        Set<Integer> a=new HashSet<Integer>(ll);
        a.addAll(ll2);
        System.out.println("The linked list without any repeted elements:- "+ a);

    }
}