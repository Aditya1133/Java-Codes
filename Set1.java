import java.util.*;
public class Set1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array 1");
        int n=sc.nextInt();
        ArrayList<Integer> arr =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the length of the array 1");
        int x=sc.nextInt();
        ArrayList<Integer> arr2 =new ArrayList<Integer>();

        for(int i=0;i<x;i++){
            arr.add(sc.nextInt());

        }
        Set<Integer> a=new HashSet<Integer>(arr);
        System.out.print("The Union of the the array is:- ");
        a.addAll(arr2);
        System.out.println(a);
        Set<Integer> b=new HashSet<Integer>(arr);
        System.out.print("The Intersection of the the array is:- ");
        b.retainAll(arr2);
        
        System.out.println(b);
    }
}