import java.util.*;
public class table{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to print the table:- ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*num);
        }
    }
}