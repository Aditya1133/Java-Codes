import java.util.*;
public class Stack1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.push(8));
        System.out.println(st.size());
        Queue<Integer> q1=new PriorityQueue<Integer>(st);
        System.out.println("\n\n");
        System.out.println(q1.add(10));
        System.out.println(q1);
        System.out.println(q1.remove(1));
        System.out.println(q1.contains(3));
        System.out.println(q1.poll());
        System.out.println(q1);
        
    }
}