import java.util.*;
public class Function1{
    public static int Sum(int num1,int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter both the numbers u want to Sum:- ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int a=Sum(num1,num2);
        System.out.print("The Sum of the two number is :- "+a);


    }
}