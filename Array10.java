import java.util.*;
public class Array10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<n;i++){
            int q=sc.nextInt();
            arr[i]=q;
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}