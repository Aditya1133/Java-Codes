import java.util.*;
public class StringTest{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The string for the check:- ");
        String a=sc.nextLine();
        String b=sc.nextLine();
        char s1[] = a.toCharArray();  // string convert into character 
        char s2[] = b.toCharArray();  // string convert into character

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    s2[j] = '0';
                }
            }
        }
        for(int i=0;i< s2.length; i++){
            if(s2[i] != '0'){
                System.out.print(s2[i]+" ");
            }
        }

    }
}