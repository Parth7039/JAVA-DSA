public class Recursion {
    //1 to n
    public static void printNumb(int n){
        if (n==0) {
            return;
        }
        printNumb(n-1);
        System.out.println(n);
    }

    //sum of n natural
    public static void printsum(int i, int n, int sum){
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum = sum +i;
        printsum(i+1, n, sum);
    }

    //factorial
    public static int printfact(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        int fact_nm1 = printfact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;

    }

    //fibonacci
    public static void printfibo(int a, int b, int n) {
        if (n==0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printfibo(b, c, n-1);
    }

    //calculate x^n
    public static int calcPower(int x, int n) {
        if (n==0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int powernm1 = calcPower(x,n-1);
        int power = x * powernm1;
        return power;
    }

    public static void main(String[] args) {
        System.out.println(calcPower(3,3));
    }
}
