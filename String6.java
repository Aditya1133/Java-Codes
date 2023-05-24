import java.util.*;
public class String6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s = "Hello World";
        String s1=sc.nextLine();
        s1.toUpperCase();
        char[]s2=s1.toCharArray();//best
        int n=s1.length();
        for(int i=0;i<n;i++){
            System.out.println(Character.toUpperCase(s2[i]));
        }
        String yourString = "23.7";
        float yourFloat = Float.parseFloat(yourString);
        String str = "54";
        int num = Integer.parseInt("54");
        double doub = Double.valueOf("54");
        System.out.println(doub+1000);
        System.out.println(num+46);
        System.out.println(String.format("%.2f",yourFloat));
        // s1.toLowerCase();
        // s1.replace('o','0');                                     
        System.out.println("The String has been traversed compeleted:- !!!");

    }
}