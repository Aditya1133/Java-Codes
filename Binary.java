import java.util.*;
public class Binary{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n=sc.nextInt();
        int pos=2;
        int Bitmask=1<<pos;

        if((Bitmask & n)==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is non zero");

        }
        System.out.print("press 1 to set(to chage the value to 1)");
        int op=sc.nextInt();
        if(op==1){
            int bitmask=1<<1;
            int num=bitmask | n;
            System.out.print(num);
        }
        else{
            int bitmask=1<<1;
            int bit= ~(bitmask);
            int num= bit & n;
            System.out.print(num);
        }
    }
}