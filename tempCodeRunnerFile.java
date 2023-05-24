import java.util.*;
public class Functions{
    public static void power(int x,int num){
        int i=1,mul=x;
        for(i=1;i>=num;i++){
            mul*=x;
        }
        System.out.print("The base of the number "+x+" and power"+num+" is:-"+mul);

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