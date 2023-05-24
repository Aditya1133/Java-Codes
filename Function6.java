import java.util.*;
public class Function6{
    public static void fib(int num){
        int num1=0,num2=1;
        if(num==0){
            System.out.print(num1);
        }
        else{
            System.out.print(" 0 , 1");
        }
        for(int i=1;i<num;i++){
            int sum=num2+num1;
            num1=num2;
            num2=sum;
            System.out.print(" , "+num2);
        }
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to print the fib:- ");
        int num=sc.nextInt();
        fib(num);
    }
}