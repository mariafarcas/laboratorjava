import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul N: ");
        int n = scanner.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print("Șirul Fibonacci până la " + n + " este: ");

        if (n >= 1) {
            System.out.print(fib1 + " ");
        }
        if (n >= 2) {
            System.out.print(fib2 + " ");
        }

        for (int i = 3; i <= n; i++) {
            int fib = fib1 + fib2;
            System.out.print(fib + " ");
            fib1 = fib2;
            fib2 = fib;
        }

        System.out.println();
    }
}

