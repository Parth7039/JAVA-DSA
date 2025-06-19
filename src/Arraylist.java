import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get elements
        int ele = list.get(0);
        System.out.println(ele);

        //add elements in bet
        list.add(2,1);
        System.out.println(list);

        //set ele
        list.set(0,2);
        System.out.println(list);

        //remove ele
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        Collections.sort(list);
        System.out.println(list);
    }
}
