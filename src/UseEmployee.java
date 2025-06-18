import java.util.Scanner;

class UseEmployee{
    public static void main(String[] args) {

    Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        int a = sc.nextInt();
        System.out.println("Enter employee name: ");
        String b = sc.next();
        emp.setdata(a, b);
        emp.showdata();
    }
}