import java.util.*;
public class LinkedList3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Enter the elements of linked list : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            linkedList.add(s);
        }
        System.out.println("The linked list is : ");
        System.out.println("Enter the element to be searched : ");
        String s=sc.next();
        if(linkedList.contains(s)){
            System.out.println("The element is present in the linked list "+linkedList.indexOf(s)+1);
        }
        else{
            System.out.println("The element is not present in the linked list");
        }
        System.out.println("Enter the element to be deleted : ");
        s=sc.next();
        if(linkedList.remove(s)){
            System.out.println("The element is deleted from the linked list");
        }
        else{
            System.out.println("The element is not present in the linked list");
        }
        System.out.println("Enter the element to be Added and the Index: ");
        String z=sc.next();
        int y=sc.nextInt();
        linkedList.add(y,z);
        System.out.println("The element is added to the linked list");
        System.out.println("The element is at the top of linked list  "+linkedList.peek());
        System.out.println("The element is at the bottom of linked list  "+linkedList.peekLast());
        System.out.println("The element is poped from the linked list  "+linkedList.pop());

        Object[] arr=linkedList.toArray();
        for(int i=0;i<linkedList.size();i++){
            System.out.print(arr[i]+" ");
        }
    }
}