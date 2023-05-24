import java.util.*;
public class test1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the time u want to run the code:- ");
        n=sc.nextInt();
        int arr[][]=new int[10][5];
        for(i=0;i<n;i++){
            for(int j=0;j<3;j++){
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }
        for(i=0;i<n;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            int c=arr[i][2];
            if(b>=a && b<c){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        }
}