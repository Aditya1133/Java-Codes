import java.util.*;
public class Pattern7{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int i,j,num;
        System.out.print("Enter the time you want to print the pattern:- ");
        num=sc.nextInt();
        System.out.println("Print the pattern:- ");
        for(i=0;i<num;i++){
            int a;
            if(i%2==0){
                System.out.print("0");
                a=0;
            }
            else{
                System.out.print("1");
                a=1;
            }
            for(j=0;j<i;j++){
                if(a==0){
                    System.out.print("1");
                    a=1;
                }
                else{
                    System.out.print("0");
                    a=0;
                }
            }
            System.out.print("\n");
        }
        // System.out.print("the printing is over with the value ="+i);


    }
}
