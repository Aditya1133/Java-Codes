import java.util.*;
public class Function7{
    public static void CommanDivisor(int num1,int num2){
        int max=0,i=1;
        if(num1<num2){
            while(i<=num1){
                if((num1%i==0) && (num2%i==0)){
                    max=i;
                }
                i++;
            }
        }
        else{
            while(i<=num2){
                if((num1%i==0) && (num2%i==0)){
                    max=i;
                }
                i++;
            }
        }
        System.out.print("The highest CommanDivisor of number "+num1+" & "+num2+" is:- "+max);

    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second number :- ");
        int num2=sc.nextInt();
        CommanDivisor(num1,num2);
    }
}