import java.util.*;
class StringBufferExample{  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer sb=new StringBuffer(a);  
        System.out.println(sb.capacity()); 
        sb.append(" Java");
        System.out.println(sb);
        sb.insert(4,"af");
        System.out.println(sb.capacity()); 
        System.out.println(sb); 
        sb.delete(4,6);
        System.out.println(sb); 
        sb.replace(1,10,"f3ff3g");
        System.out.println(sb); 
        System.out.println(sb.capacity()); 
        sb.append("f3eg4wha5e4ywtgh5e");
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(100);//(old *2)+2;
        System.out.println(sb.capacity()); 



}  
} 