import java.util.*;
public class oddevencheck{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:- ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("Your Number is Even ");
        }
        else{
            System.out.print("Your Number is Odd ");
        }

    }
}
