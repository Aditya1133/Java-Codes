import java.util.*;
public class String1{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        // to take the input from the user
        System.out.print("Enter your name:- ");
        String name=sc.nextLine();
        //string lenght(to get string lenght)
        int len= name.length();
        System.out.print("The length of the name if :- "+len);
        //charAt(to get each charachter)
        for(int i=0;i<len;i++){
            System.out.print("\n"+name.charAt(i));
        } 
        System.out.print("\n Enter your First name:- ");
        String first_name=sc.next();
        System.out.print("\n Enter your Last name:- ");
        String last_name=sc.next();
        //to concatinate
        String full_name=first_name+" "+ last_name;
        System.out.print("the full name is :-"+full_name);
        System.out.print("Enter the string that u want to comapre:- ");
        String comp1=sc.nextLine();
        System.out.print("Enter the string that u want to comapre:- ");
        String comp2=sc.nextLine();
        if(comp1.compareTo(comp2)==0){
            System.out.println("The string are Same");
        }
        else{
            System.out.println("The string are not Same");
        }
        String name2="My name is tony Stark";
        System.out.println(name2.substring(8));
    }
}