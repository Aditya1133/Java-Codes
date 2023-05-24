import java.util.*;
public class Arraysort{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [20];
        int n;
        System.out.print("enter the lenght of the array:- ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the value at index["+i+"] :- " );
            int a=sc.nextInt();
            arr[i]=a;
        }
        System.out.println("The array before the Bubble sort:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The array after the Bubble sort:- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}