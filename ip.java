import java.util.*;
public class ip{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final String a=sc.nextLine();
        int ind=a.indexOf('.');
        String b=a.substring(0,ind);
        int ip=Integer.valueOf(b);
        if(ip>=0 && ip<=127){ 
            System.out.println("The Class of the Ip is A");
        }
        else if(ip>=128 && ip<=191){
            System.out.println("The Class of the Ip is B");
        }
        else if(ip>=192 && ip<=223){
            System.out.println("The Class of the Ip is C");
        }
        else if(ip>=224 && ip<=239){
            System.out.println("The Class of the Ip is D");
        }
        else{
            System.out.println("The Class of the Ip is E");
        }
    }
    
}