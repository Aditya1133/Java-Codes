import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        String s2="";
        int len=s1.length();
        for(int i=len-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s2.equals(s1)){
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
    }
}
