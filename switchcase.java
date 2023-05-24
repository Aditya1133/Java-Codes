import java.util.*;
public class switchcase{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Choise:- ");
        int button= sc.nextInt();
        switch(button){
            case 1: System.out.print("HELLO");
            break;
            case 2: System.out.print("NAMASTE");
            break;
            case 3: System.out.print("BONJOUR");
            break;
            default: System.out.print("INVALID INPUT");
        }
    }
}