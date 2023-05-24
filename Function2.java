import java.util.*;
public class Function2{
    public static void Factorial(int num){
        int i=0,mul=1;
        for(i=num;i>0;i--){
            mul*=i;
        }
        System.out.print("The Factorial of the number "+num+" Is:- "+mul);

    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number u want to find the Factorial:- ");
        int num=sc.nextInt();
        if(num<0){
            System.out.print("There is no factorial possible for the number :- "+num);
        }
        else{
            Factorial(num);
        }

    }
}