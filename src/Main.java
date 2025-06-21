import java.util.*;

public class Main {
    public static LinkedList mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> list3 = new LinkedList<>();
        for (int i=0; i<list1.size(); i++){
            int val = (int) list1.get(i);
            list3.add(val);
        }
        for (int i=0; i<list2.size(); i++){
            int val = (int) list2.get(i);
            list3.add(val);
        }
        Collections.sort(list3);
        return list3;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));

        LinkedList<Integer> merged = mergeTwoLists(list1, list2);
        System.out.println("Merged and sorted list: " + merged);
    }
}