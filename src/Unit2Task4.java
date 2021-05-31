public class Unit2Task4 {
    public static void main(String[] args) {
        int a = 73;
        int b = 100;
        int ab = 0;
        if (a>=0){
            for (int i = 0; i<a; i++) {
                ab = ab + b;
            }
        }
        else {for (int i = 0; i>a; i--) {
            ab = ab - b;}
        }
        System.out.println(ab);
    }
}
