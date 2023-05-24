public class Main{
    public static void main(String []args){
        inter1 ob =new intercls();
        intercls abc=new intercls();
        ob.out1();
        ob.out2();
        //ob.out3(); it will give the error as it was declared in the inter1 and not in the intercls;
        abc.out3();
    }
}