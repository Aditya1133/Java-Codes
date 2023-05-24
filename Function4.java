import java.util.*;
public class Function4{
    public static void SumOdd(int num){
        int i,sum=0;
        for(i=1;i<=num;i+=2){
            sum+=i;
        }
        System.out.print("The Sum of the all the odd number till "+num+" Is:- "+sum);

    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number u want to find the sum :- ");
        int num=sc.nextInt();
        SumOdd(num);

    }
}