import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        a = sc.nextFloat();
        Circle circle = new Circle();
        circle.setRad(a);
        circle.CalcArea();
        circle.CalcCircum();
        circle.showdata();
    }
}
