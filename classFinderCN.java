import java.util.*;
public class classFinderCN{
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ip address:- ");
        String ip=sc.nextLine();
        int length=ip.length();
        int index = ip.indexOf('.');
        String ipsub = ip.substring(0,index);
        int classfinal = Integer.valueOf(ipsub);
        if(classfinal>=0 && classfinal<=127){
            System.out.println("the Ip belong's to the Class A");
        }
        else if(classfinal>=128 && classfinal<=191){
            System.out.println("the Ip belong's to the Class B");
        }
        else if(classfinal>=192 && classfinal<=223){
            System.out.println("the Ip belong's to the Class C");
        }
        else if(classfinal>=224 && classfinal<=239){
            System.out.println("the Ip belong's to the Class D");
        }
        else{
            System.out.println("the Ip belong's to the Class E");
        }
    }
}