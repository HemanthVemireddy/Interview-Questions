package Challange_100_Days;

import java.util.ArrayList;
import java.util.List;

public class Retain_All
{
    /*
    retainAll() method in Java –
   The retainAll() method in Java is used to retain only the elements in the list that are
   contained in another collection. It removes all elements from the list that are not
   contained in the specified collection.

 This method is particularly useful when you need to find the intersection of elements between
 two lists or when you want to filter out unwanted elements based on another collection.
     */
    public static void main(String[] args)
    {
        Retain_All.CommonList();
    }
    public static void CommonList()
    {
        //First List
        List<Integer>FirstList = new ArrayList<Integer>();
        FirstList.add(20);
        FirstList.add(25);
        FirstList.add(9);

        System.out.println("First List : "+FirstList);

        List<Integer>SecoundList = new ArrayList<Integer>();
        SecoundList.add(20);
        SecoundList.add(9);
        SecoundList.add(23);

        FirstList.retainAll(SecoundList);

        System.out.println("Secoundlist : "+SecoundList);
        System.out.println("Numbers present in both list :"+FirstList);
        System.out.println("Array Size : "+FirstList.size());
        System.out.println("Array First Position : "+FirstList.getFirst());
        System.out.println("Array Last Position : "+FirstList.getLast());
        System.out.println("Array Reversed : "+FirstList.reversed());
        System.out.println("Array Remove Last : "+FirstList.removeLast());
    }
}
