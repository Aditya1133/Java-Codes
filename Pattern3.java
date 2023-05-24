import java.util.*;
public class Pattern3{
    public static void main(String arg[]){
        System.out.print("Enter the number of time you want to print the pattern: -");
        Scanner sc=new Scanner(System.in);
        int i,num,j;
        num=sc.nextInt();
        System.out.println("Printing the pattern:- ");
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}