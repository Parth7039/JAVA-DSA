package patterns;

public class Inverted_half_pyramid {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        for (int i=m; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
