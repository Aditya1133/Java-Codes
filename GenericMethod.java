import java.util.*;
public class GenericMethod{
    public static<E> void printArray(E[]inputArray){
        for(E e:inputArray){
            System.out.println(e);
    }
    System.out.println();
}
public static void main(String[]args){
    Integer[]IntArray={1,2,3,4,5};
    Double[]doubleArray={1.1,2.2,3.3,4.+4,5.5};
    Character[]CharArray={'H','E','L','L','O'};
    System.out.println("Array in Interger:- ");
    printArray(IntArray);
    System.out.println("Array in Double:- ");
    printArray(doubleArray);
    System.out.println("Array in String:- ");
    printArray(CharArray);
    }
}