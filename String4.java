import java.util.*;
public class String4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        int arr[]=new int[100];
        int len=s.length();
        for(int i=0;i<len;i++){
            count=1;
            char k=s.charAt(i);
            for(int j=i+1;j<len;j++){
               if(s.charAt(j)==k){
                count++; 
            }
        }
        arr[i]=count;
        // System.out.println("The char "+k+" has "+count+" in the String ");
        }
        int max=-88655;
        char[] z=null;
        int num=0;
        for(int i=0;i<len;i++){
            if(arr[i]>max){
                max=arr[i];
                z=s.toCharArray();
                num=i;
            }
        }
        System.out.println("The longest repeating char is "+z[num]+" and its repeating count is "+max);
    }
} 