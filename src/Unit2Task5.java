public class Unit2Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 1) {
                System.out.println(i + " дюйм = " + (2.54 * i) + "см");
            } else if (i == 2 || i == 3 || i == 4) {
                System.out.println(i + " дюйма = " + (2.54 * i) + "см");
            } else {
                System.out.println(i + " дюймов = " + (2.54 * i) + "см");
            }
        }
    }
}
