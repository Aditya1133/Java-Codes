import java.util.*;
public class Pattern12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the times u want to print the pattern:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int alpha=65;
            int alphar=65+i;
            int a=n-i-1;
            for(int k=0;k<a;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha + j)+" ");
            }
            for(int z=0;z<i;z++){
                System.out.print((char)(alphar -z-1)+" ");
            }
            System.out.print("\n");
        }
    }
}