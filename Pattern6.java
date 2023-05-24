import java.util.*;
public class Pattern6{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int i,j,num;
        System.out.print("Enter the time you want to print the pattern:- ");
        num=sc.nextInt();
        System.out.println("Print the pattern:- ");
        for(i=0;i<num;i++){
            int a=1;
            for(int k=0;k<num-i-1;k++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.print("\n");
        }
    }
}