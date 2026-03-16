import java.util.Scanner;

public class MainArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Сложение: " + ArithmeticOperations.add(num1, num2));
        System.out.println("Вычитание: " + ArithmeticOperations.subtract(num1, num2));
        System.out.println("Умножение: " + ArithmeticOperations.multiply(num1, num2));
        try {
            System.out.println("Деление: " + ArithmeticOperations.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}