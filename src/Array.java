import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*int[] marks = new int[5];
        marks[0] = 20;
        marks[1] = 40;
        marks[2] = 70;
        int[] marks = {20,30,40};
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }*/

        int size = 5;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.print("Enter the Array(5): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Target found at index: "+i);
            }
        }
    }
}
