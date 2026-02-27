class Product {
    String name;
    String releaseDate;
    String manufacturer;
    String country;
    double price;
    boolean available;

    public Product(String name, String releaseDate, String manufacturer, String country, double price, boolean available) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Название: " + name + "\n" +
                "Дата выпуска: " + releaseDate + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Страна: " + country + "\n" +
                "Цена: " + price + " руб.\n" +
                "Доступность: " + (available ? "В наличии" : "Нет в наличии") + "\n";
    }
}

public class Massiv {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Xiaomi Mi 11", "01.11.2023", "Xiaomi", "Китай", 49990, true);
        productsArray[1] = new Product("Apple iPhone 13", "30.09.2023", "Apple", "США", 89990, false);
        productsArray[2] = new Product("Samsung Galaxy Z Fold 4", "01.08.2023", "Samsung", "Южная Корея", 159990, true);
        productsArray[3] = new Product("Sony PlayStation 5", "15.11.2023", "Sony", "Япония", 49990, false);
        productsArray[4] = new Product("Apple MacBook Air M2", "15.06.2023", "Apple", "США", 99990, true);

        for (Product product : productsArray) {
            System.out.println(product);
            System.out.println();
        }
    }
}