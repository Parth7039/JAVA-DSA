import java.util.Scanner;

public class Binary_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        int number = sc.nextInt();
        String numstring = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numstring.length(); i++) {
            if (numstring.charAt(i) == '1') {
                sum += (int) Math.pow(2,numstring.length()-1-i);
            }
        }
        System.out.println(sum);
    }
}
