import java.util.*;
public class Array2{
    public static void Printreverse(int arr[],int num){
        for(int i=num-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertion(int arr[],int num){
        Scanner sc=new Scanner(System.in);
        int pos,input;
        System.out.print("\nEnter the position you want to enter the element:- ");
        pos=sc.nextInt();
        System.out.print("Enter the element:- ");
        input=sc.nextInt();
        for(int i=num;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=input;

        System.out.print("The array after the insertionis :- ");
        for(int i=0;i<num+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Deletion(int arr[],int num){
        Scanner sc=new Scanner(System.in);
        int pos;
        System.out.print("\n Enter the position you want to delete the element:- ");
        pos=sc.nextInt();
        for(int i=pos;i<num;i++){
            arr[i]=arr[i+1];
        }

        System.out.print("The array after the insertionis :- ");
        for(int i=0;i<num-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void maximum(int arr[],int num){
        int max=-88655;
        for(int i=0;i<num;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The Maximum value in the array is:- "+max);

    }
    public static void minimum(int arr[],int num){
        int min=9876533;
        for(int i=0;i<num;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the Minimum value in the array is :- "+min);
    }
    public static void sort(int arr[],int num){
        int i,j;
        int min =0;
        for(i=0;i<num;i++){
            min=arr[i];
            for(j=i;j<num;j++){
                if(arr[j]<min){
                    int temp=min;
                    min=arr[j];
                    arr[j]=temp;
                }

            }
            arr[i]=min;
        }
        System.out.println("athe array after the sort:- ");
        for(i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        System.out.print("Enter the size of the array:- ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Enter the element at the index "+i+" is:- ");
            int a=sc.nextInt();
            arr[i]=a;
        }
        System.out.println("\nPress 1 for printing in reverse");
        System.out.println("Press 2 for Insertion in the array");
        System.out.println("Press 3 for Deletion in the array");
        System.out.println("Press 4 to Find the Maximun value in the array");
        System.out.println("Press 5 to Find the Minimum value in the array");
        System.out.println("Press 6 to sort the array");

        int a=sc.nextInt();
        switch(a){
            case 1:Printreverse(arr,num);
            break;
            case 2:insertion(arr,num);
            break;
            case 3:Deletion(arr,num);
            break;
            case 4:maximum(arr,num);
            break;
            case 5:minimum(arr,num);
            break;
            case 6: sort(arr,num);
            break;
            default:System.out.print("The value is INVALID!!!");
        }
    }
}


