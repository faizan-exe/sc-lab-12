package Task3_SumOfDigits;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n < 0) n = Math.abs(n); // Convert negative to positive
        if (n == 0) return 0; // Base case
        return (n % 10) + sumOfDigits(n / 10);
    }
}
