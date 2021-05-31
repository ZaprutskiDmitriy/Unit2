public class Unit2Task2 {
    public static void main(String[] args) {
        int am = 1;
        for (int i = 1; i <= 8; i++) {
            am = am * 2;
            if (i == 1) {
                System.out.println("Количество амёб через " + (i * 3) + " часа " + am);
            } else {
                System.out.println("Количество амёб через " + (i * 3) + " часов " + am);
            }
        }
    }
}