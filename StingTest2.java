import java.util.*;
public class StingTest2{
    public static void main(String []arg) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        char s1[]=a.toCharArray();
        int count=0;
        int len=s1.length;
        for(int i=0;i<27;i++){
            char z=(char)(65+i);
            for(int j=0;j<s1.length;j++){
                count++;
                if(z==s1[j]){
                    s1[j]='0';
                    count=0;
                }
            }
            if(count==len){
                System.out.print("the String Doesn't comtain all the words!! ");
            }        
        }
        System.out.print("the string contains all the words from ato z");

        
    }
}