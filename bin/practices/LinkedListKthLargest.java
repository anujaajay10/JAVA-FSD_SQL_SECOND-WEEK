package practices;

import java.util.*;
import java.util.stream.*;

public class LinkedListKthLargest {

    public static List<Integer> findKthLargest(LinkedList<Integer> list, int k) {
        return list.stream()
                   .sorted(Comparator.reverseOrder())
                   .limit(k)
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 2, 5, 7, 1, 8, 4));
        System.out.println(list);
        int k = 4;
        List<Integer> kLargest = findKthLargest(list, k);
        System.out.println(kLargest.get(k-1));
    }
}

