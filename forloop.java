import java.util.*;
public class forloop{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Time you want to print the number:- ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(i+1);
        }
    }
}