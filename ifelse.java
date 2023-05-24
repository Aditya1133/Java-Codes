import java.util.*;
public class ifelse{
    public static void main(String arg[]){
        System.out.print("Enter your Age:- ");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.print("You cant vote");
        }
    }
}