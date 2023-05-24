import java.util.*;
public class Pattern4{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int i=0,j=0,num;
        System.out.print("Enter the number u want to print the pattern:- ");
        num=sc.nextInt();
        System.out.println("printing the pattern:- ");
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                if(j==0||j==num-1||i==0||i==num-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }



    }
} 