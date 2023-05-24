import java.util.*;
class MultiThreading extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("the Thread number "+Thread.currentThread().getId()+" Running");
            System.out.println("the Thread number "+Thread.currentThread().getName()+" Running");

        }
        catch(Exception e){
            System.out.println("You cant do this!!!");
        }
    }
}

public class Multi{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            MultiThreading obj=new MultiThreading();
            obj.start();
        }
    }
}