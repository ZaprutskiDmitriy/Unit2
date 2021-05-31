public class Unit2Task3 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        for (int i = 0; i <= 8; i++) {
            sum = sum + a;
            a = a * 2;
        }
        System.out.println(sum);
    }
}
