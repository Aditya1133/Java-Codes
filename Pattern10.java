import java.util.*;
public class Pattern10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the times u want to print the pattern:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int alphabet =65;
            for(int j=0;j<n-i;j++){
            System.out.print((char)(alphabet +j)+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            int alpha=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+j)+" ");
            }
        System.out.print("\n");
        }
    }
}