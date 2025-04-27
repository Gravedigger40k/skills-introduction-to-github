public class Calculator {
    public static int add_numbers(int a, int b) {
        return a+b;
    }

    public static boolean is_even(int n) {
        return n % 2 == 0;
        }

    public static double celsius_to_fahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczba musi być nieujemna");
        }
        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static boolean is_prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
