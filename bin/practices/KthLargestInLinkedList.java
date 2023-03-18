package practices;


import java.util.*;

public class KthLargestInLinkedList {
  public static void main(String[] args) {
      // Create a linked list
      LinkedList<Integer> list = new LinkedList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter k");
      int k = sc.nextInt(); // Find the 3rd largest element
      
      // Convert the linked list to an array and sort it in descending order
      Integer[] arr = list.toArray(new Integer[list.size()]);
      Arrays.sort(arr, Comparator.reverseOrder());
      
      // Get the Kth largest element from the sorted array
      int kthLargest = arr[k-1];
      
      System.out.println("Kth largest element: " + kthLargest);
  }
}