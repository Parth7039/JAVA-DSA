import java.util.LinkedList;

public class Linked_L {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("XYZ");
        list.addFirst("PQR");
        list.addLast("LMN");
        System.out.println(list.contains("PQR"));
        System.out.println(list.size());;
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.print("null");
    }
}
