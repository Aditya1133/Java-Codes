import java.util.*;
public class StringBuilder3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder sb=new StringBuilder(a);
        // sb.append("dfeaofi3gsg esgrwgoisg4 w4egi4woig");
        System.out.println(sb.capacity());
        sb.insert(3,"z");
        sb.insert(6,"y");
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        sb.replace(1,3,"weq");
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.append("dfeaofi3gsg esgrwgoisg4 w4egi4woig");
        System.out.println(sb.capacity());
        sb.append("tkeryj6het5wagwARHETJRYKEUT6JR ARWEHTJHRWGHRTS");
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        





    }
}