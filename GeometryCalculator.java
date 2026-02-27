interface Shape {

    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }


    String getFillColor();

    String getBorderColor();
}


class Круг implements Shape {
    private final double radius;
    private final String fillColor;
    private final String borderColor;


    public Круг(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}


class Прямоугольник implements Shape {
    private final double length;
    private final double width;
    private final String fillColor;
    private final String borderColor;


    public Прямоугольник(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}


class Треугольник implements Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final String fillColor;
    private final String borderColor;


    public Треугольник(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        Shape круг = new Круг(5.0, "Красный", "Черный");
        Shape прямоугольник = new Прямоугольник(10.0, 5.0, "Синий", "Зеленый");
        Shape треугольник = new Треугольник(3.0, 4.0, 5.0, "Желтый", "Фиолетовый");

        printShapeDetails(круг);
        printShapeDetails(прямоугольник);
        printShapeDetails(треугольник);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}