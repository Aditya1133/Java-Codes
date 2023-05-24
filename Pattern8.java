import java.util.*;
public class Pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int alphabet=65;
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.print("\n");
        }
    }
}