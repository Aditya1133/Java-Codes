import java.util.*;
public class Pattern13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the times u want to print the pattern:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int alpha=65;
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n-1;i++){
            int alphar=65;
            for(int k=0;k<i+1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n-1-i;j++){
                System.out.print((char)(alphar+j)+" ");  
            }
            System.out.print("\n");
        }
    }
}