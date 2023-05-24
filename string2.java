import java.util.*;
public class string2{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string to be set inn the upper case:- ");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        // StringBuilder sb=new StringBuilder(name);
        int len=sb.length();
        System.out.print("\nthe string in upper case is:- "+name.toUpperCase());
        System.out.print("\nEnter the string to be set in the lower case:- ");
        String name2=sc.nextLine();
        System.out.print("\nthe string in upper case is:- "+name2.toLowerCase());
        System.out.print("\n the string index of S is:- "+name.indexOf('S'));
        int z=name.indexOf('S');
        System.out.print("\n the sub string is:- "+name.substring(0,z));
    }
}