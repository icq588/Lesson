import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;
    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Создание объекта парка
        Park park = new Park("Сказочный парк");

        park.addAttraction("Гигантская карусель", "09:00 - 23:00", 400);
        park.addAttraction("Комната страха", "10:00 - 22:00", 300);
        park.addAttraction("Американские горки", "08:00 - 20:00", 600);
        park.addAttraction("Водные горки", "10:00 - 21:00", 500);

        park.showAttractions();
    }

    public void addAttraction(String name, String workingHours, double cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

    public void showAttractions() {
        System.out.println("Информация о аттракционах парка " + parkName + ":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    public static class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Название: " + name + ", Время работы: " + workingHours + ", Стоимость: " + cost + " руб.";
        }
    }
}