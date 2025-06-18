package patterns;

public class zero_one_triangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 0;
        for (int i = 0; i <=n; i++) {
            for (int j=1; j<=i; j++){
                /*if (number == 1){
                    System.out.print("0 ");
                    number = 0;
                }
                else {
                    System.out.print("1 ");
                    number = 1;
                }*/
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
