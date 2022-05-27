import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 100;
        boolean primeControl = false;

        for (int i = 2; i <= number; i++) {
            for (int k = 2; k <= i; k++) {
                if (i % k == 0 && i > 2 && k != i) {
                    primeControl = false;
                    break;
                } else {
                    primeControl = true;
                }
            }
            if (primeControl == true) {
                System.out.println(i);
            }
        }
    }
}
