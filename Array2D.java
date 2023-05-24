import java.util.*;
public class Array2D{
    public static void print(int row,int col,int arr[][]){
        int i,j;
        System.out.print("the matrix that has been create is as followed:- \n");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
    public static void sprialprint(int row,int col,int arr[][]){
        print(row,col,arr);
        int r=0,c=0;
        row--;
        col--;
        int count = 16;
        int z=1,i=0;
        while(z<=count){
            for(i=r;i<=col;i++){
                System.out.print(arr[r][i]+" ");
                count++;
            }
            // System.out.print("\n");
            r++;
            for(i=r;i<=row;i++){
                System.out.print(arr[i][col]+" ");
                count++;
            }
            // System.out.print("\n");
            col--;
            for(i=col;i>=c;i--){
                System.out.print(arr[row][i]+" ");
                count++;
            }
            // System.out.print("\n");
            row--;
            for(i=row;i>=r;i--){
                System.out.print(arr[i][c]+" ");
                count++;
            }
            // System.out.print("\n");
            c++;
            if(count==16){
                break;
            }
        }
        System.out.print("The Sprial printing  Has been done");
    }
    public static void maximum(int row,int col,int arr[][]){
        int max=-329492;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.print("The maximum number is the :-"+max);
    }
    public static void minimum(int row,int col,int arr[][]){
        int min=329492;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.print("The maximum number is the :-"+min);
    }
    public static void sumofdiagonals(int row,int col,int arr[][]){
        int sum=0;
        for(int i=0;i<row;i++){
            int a=arr[i][i];
            sum+=a;
        }
        System.out.print("the sum of the diagonals is :-"+sum);
    }
    public static void main(String arg[]){
        Scanner sc =new Scanner (System.in);
        int arr[][]=new int[10][10];
        System.out.print("Enter the number of rows:-");
        int row=sc.nextInt();
        System.out.print("Enter the number of colounm:-");
        int col=sc.nextInt();
        
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print("enter the Element at the index["+i+"]["+j+"]:- ");
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }
        System.out.println("\nPress 1 to print matix ");
        System.out.println("Press 2 for the sprial print");
        System.out.println("Press 3 to find the maximum");
        System.out.println("Press 4 to find the minimum");
        System.out.println("Press 5 to find the sum of the diagonal");
        int option=sc.nextInt();
        switch(option){
            case 1: print(row,col,arr);
            break;
            case 2:sprialprint(row,col,arr);
            break;
            case 3:maximum(row,col,arr);
            break;
            case 4: minimum(row,col,arr);
            break;
            case 5:sumofdiagonals(row,col,arr);
            break;
            default:System.out.print("INVALID INPUT !!!!");
        }
    }
}