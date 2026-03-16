import java.util.Scanner;

public class MainCompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        String result = CompareNumbers.compare(num1, num2);
        System.out.println("Результат сравнения: " + result);
    }
}