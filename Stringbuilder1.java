import java.util.*;
public class Stringbuilder1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name:- ");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        // to change the char
        // sb.setCharAt(2,"A");
        System.out.println("the String after change- "+sb);
        // to insrest at a positions
        sb.insert(0,"A");
        System.out.println(sb);
        // to delete the word or a range of words
        System.out.println("Enter the range that you want to delete");
        int n=sc.nextInt();
        //does not take the last number or lenght;
        sb.delete(0,n);
        System.out.println("the String after the deletion nis :- "+sb); 
        // to append the the word at the end of the string 
        System.out.println("Enter the char which you want to add:- ");
        String a =sc.next();
        sb.append(" "+a);
        System.out.print("The String after the append:- "+sb);
        

    }
}