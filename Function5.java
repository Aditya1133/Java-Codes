import java.util.*;
public class Function5{
    public static void power(int x,int num){
        int i=1,mul=1;
        while(i<=num){
            mul=mul*x;
            i++;
        }
        System.out.print("The base of the number "+x+" and power "+num+" is:-"+mul);

    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number base:- ");
        int x=sc.nextInt();
        System.out.print("Enter the number power:- ");
        int num=sc.nextInt();
        power(x,num);
    }
}