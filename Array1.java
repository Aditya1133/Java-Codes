import java.util.*;
public class Array1{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[20];
        System.out.print("Enter the size of the array:- ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Enter the element at the index "+i+" is:- ");
            int a=sc.nextInt();
            arr[i]=a;
        }

        System.out.print("The array you have entered is :- ");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}