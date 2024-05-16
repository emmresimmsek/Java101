package Metotlar;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recursive ile Fibonacci Serisi Bulan Programcanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Fibonacci(0) = 0 ve Fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Fibonacci kuralı
    }

}
