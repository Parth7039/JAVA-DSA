import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers [i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(numbers));
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[i][j] == target){
                    System.out.println("Target found at index: ["+i+"],["+j+"]");
                }
            }
        }
    }
}
