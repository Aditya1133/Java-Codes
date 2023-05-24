//to count the number of occerences in the array
import java.util.*;
public class Array3{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lenght of the array:- ");
        int n=sc.nextInt();
        int arr[]=new int[20];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at the index["+i+"]:- ");
            int a=sc.nextInt();
            arr[i]=a;
        }
        System.out.print("Enter the array that u want to find the count:- ");
        int x=sc.nextInt();
        int count=0;
        // int i=0;
        //to count the number of occurency in sorted array
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                count++;
            }
        }
        System.out.print("The number of times the ["+x+"] has occured is:- "+count);
    }
}