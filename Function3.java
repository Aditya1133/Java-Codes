import java.util.*;
public class Function3{
    public static void average(int a,int b,int c){
        float sum=a+b+c;
        System.out.print("the Average of the 3 number is :- "+sum/3);
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your First number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter your Second number :- ");
        int num2=sc.nextInt();
        System.out.print("Enter your Third number :- ");
        int num3=sc.nextInt();
        average(num1,num2,num3);

    }
}