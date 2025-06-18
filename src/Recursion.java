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

    public static void main(String[] args) {
        System.out.println(printfact(5));
    }
}
