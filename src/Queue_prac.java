public class Queue_prac {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }
    }
    public static void main(String[] args) {

    }
}
