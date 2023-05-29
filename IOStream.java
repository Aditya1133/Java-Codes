import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class IOStream{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // try {
        //     FileOutputStream fout=new FileOutputStream("Aditya.txt");
        //     fout.write(65);
        //     String s="    Hi My name is Aditya Saini And I am trying to do IOStream!!!";
        //     byte[]b=s.getBytes();
        //     fout.write(b);
        //     fout.close();
        //     System.out.print("The code was successfull executed");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.print(e);
        // }
        try {
            FileInputStream fin=new FileInputStream("Aditya.txt");
            int i=fin.read();
            System.out.println((char)i);
            int k=0;    
            while((k=fin.read())!=-1){
                System.out.print((char)k);
            }
            fin.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);

        }

    }
}