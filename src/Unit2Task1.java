public class Unit2Task1 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            sum = sum + 10 + 0.1*sum;
        }
        System.out.println(sum);
    }
}
