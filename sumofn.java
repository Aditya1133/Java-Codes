import java.util.*;
public class sumofn{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till u want to Sum:- ");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        for(i=1;i<=num;i++){
            sum+=i;
        }
        System.out.print("the Sum of n natural number is :- ");
        System.out.print(sum);
    }
}