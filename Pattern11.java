import java.util.*;
public class Pattern11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the times u want to print the pattern:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int alpha=65+n-1;
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha-j)+" ");
            }
            System.out.print("\n");
        }
    }
}