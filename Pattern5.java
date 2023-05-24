import java.util.*;
public class Pattern5{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int i,j,num;
        System.out.print("Enter the time you want to print the pattern:- ");
        num=sc.nextInt();
        System.out.println("Print the pattern:- ");
        for(i=num;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}