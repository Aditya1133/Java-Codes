//to find the Union and Intersection
import java.util.*;
public class Array4{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the array1:- ");
        int n1=sc.nextInt();
        int arr1[]=new int[20];
        System.out.print("Enter the length of the array2:- ");
        int arr2[]=new int[20];
        int n2=sc.nextInt();
        System.out.print("Enter the elements of array1:- \n" );
        for(int i=0;i<n1;i++){
            int z=sc.nextInt();
            arr1[i]=z;
        }
        System.out.print("Enter the elements of array2:- \n" );
        for(int i=0;i<n2;i++){
            int z=sc.nextInt();
            arr2[i]=z;
        }
        // to intersection
        int k=0;
        int count=0;
        int arr3[]=new int[20];
        int arr4[]=new int[20];
        if(n1>n2){
            for(int i=0;i<n1;i++){
                int z=arr1[i];
                for(int j=0;j<n2;j++){
                    if(z==arr2[j]){
                        arr3[k]=z;
                        count++;
                        k++;
                    }
                }
            }
            System.out.println("the intersection of two array is:- ");
            for(int i=0;i<count;i++){
                System.out.print(arr3[i]+" ");
            }
            for(int i=0;i<n1;i++){
                int z=arr1[i];
                for(int j=0;j<n2;j++){
                    if(z==arr2[j]){
                        arr2[j]=0;
                    }
                }
            }
            int a=n1;
            for(int i=0;i<n1;i++){
                arr4[i]=arr1[i];
            }
            for(int q=0;q<n2;q++)
                if(arr2[q]!=0){
                    arr4[a]=arr2[q];
                    a++;
                }   
            }
            System.out.println("\nthe Union of two array is:- ");
            for(int i=0;i<a;i++){
                System.out.print(arr4[i]+" ");
            }
            
        }
    }
}