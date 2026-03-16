import java.util.Scanner;

public class MainTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        double result = TriangleArea.area(a, b, c);
        System.out.println("Площадь треугольника = " + result);
    }
}