import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        long result = FactorialCalculator.factorial(n);
        System.out.println("Факториал числа " + n + " = " + result);
    }
}