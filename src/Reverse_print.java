// print the digits in reverse order

public class Reverse_print {
    public static void main(String[] args) {
        int num = 2025;
        System.out.println("Number is "+num);
        while(num>0){
            int digit = num%10;
            System.out.println(digit);
            num = num/10;
        }
    }
}
