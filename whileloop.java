import java.util.*;
public class whileloop{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of time you want to print:- ");
        int num=sc.nextInt();
        int i=0;
        while(i<num){
            System.out.println(i+1);
            i++;
        }
        System.out.print("Your code have been Executed Successfuly");
    }
}