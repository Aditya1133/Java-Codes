import java.util.*;
public class check{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:- ");
        String word=sc.nextLine();
        int n=word.length();
        int countw=0,countn=0,counts=0;
        for(int i=0;i<n;i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z' || (word.charAt(i)>='A' && word.charAt(i)<='Z')){
                System.out.println("Its a word :- "+word.charAt(i));
                countw++;
            }
            else if(word.charAt(i)>='0' && word.charAt(i)<='9'){
                System.out.println("It's a number :- "+word.charAt(i));
                countn++;
            }
            else{
                System.out.println("It's a Special char :- "+word.charAt(i));
                counts++;
            }
        }
        System.out.println("The count of word in the String is :- "+countw);
        System.out.println("The count of number in the String is :- "+countn);
        System.out.println("The count of Special char in the String is :- "+counts);
    }
}