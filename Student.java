import java.util.*;
public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Class:- ");
        int class1=sc.nextInt();
        int arr1[]=new int[20];
        String arr2[]=new String[20];
        System.out.println("Enter the rool no:- ");
        for(int i=0;i<10;i++){
            int a=sc.nextInt();
            arr1[i]=a;
        }
        System.out.println("Enter the Name:- ");
        for(int i=0;i<10;i++){
            String a=sc.nextLine();
            arr2[i]=a;
        }
        System.out.println("printing the Roll no :- ");
        for(int i=0;i<10;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("printing the Name :- ");
        for(int i=0;i<10;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}