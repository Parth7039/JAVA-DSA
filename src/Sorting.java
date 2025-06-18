import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(){
        //Takes the heaviest element and puts in the last eventually left with the lightest on the first position
        //time complexity = O(n^2)
        int[] arr = {7,8,3,1,2};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(){
        //consider 1st element as smallest then after comparing with elements change the smallest and swap them
        int[] arr = {7,8,3,1,2};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionSort(){
//Divided into two parts then elements from unsorted zone are put to sorted zone

    }

    public static void main(String[] args) {
        selectionSort();
    }
}
