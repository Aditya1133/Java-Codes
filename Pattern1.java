import java.util.*;
public class Pattern1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the time you want to print the pattern:- ");
        int num=sc.nextInt();
        System.out.println("Print the pattern:- ");
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}