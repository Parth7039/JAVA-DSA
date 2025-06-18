public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));//T
        sb.setCharAt(0,'M');
        System.out.println(sb);//Mony
        sb.insert(0,'S');
        System.out.println(sb);//SMony
        sb.delete(1,3);
        System.out.println(sb);//Sny
    }
}
