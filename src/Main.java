import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String first = "parth";
        String last = "bhamare";
        String fullname = first +" "+ last; //parth bhamare
        System.out.println(fullname.toUpperCase());
        if (first.compareTo(last) == 1){
            System.out.println("match");
        } else {
            System.out.println("no match");
        }
    }
}