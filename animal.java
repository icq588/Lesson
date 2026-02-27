class Животное {
    private static int countЖивотных = 0;

    public Животное() {
        countЖивотных++;
    }

    public static int getCountЖивотных() {
        return countЖивотных;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

class Собака extends Животное {
    private static int countСобак = 0;
    private int номер;

    public Собака(int номер) {
        super();
        this.номер = номер;
        countСобак++;
    }

    public static int getCountСобак() {
        return countСобак;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака " + номер + " пробежала " + distance + " м.");
        } else {
            System.out.println("Собака " + номер + " не может пробежать " + distance + " м. Максимум 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака " + номер + " проплыла " + distance + " м.");
        } else {
            System.out.println("Собака " + номер + " не может проплыть " + distance + " м. Максимум 10 м.");
        }
    }

    public int getНомер() {
        return номер;
    }
}

class Кот extends Животное {
    private static int countКотов = 0;
    private static int мискаСЕдой = 0;
    private boolean сытость = false;
    private int номер;

    public Кот(int номер) {
        super();
        this.номер = номер;
        countКотов++;
    }

    public static void добавитьЕдуВМиску(int количество) {
        мискаСЕдой += количество;
        System.out.println("В миску добавлено " + количество + " еды. Всего еды в миске: " + мискаСЕдой);
    }

    public static int getCountКотов() {
        return countКотов;
    }

    public static int getМискаСЕдой() {
        return мискаСЕдой;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот " + номер + " пробежал " + distance + " м.");
        } else {
            System.out.println("Кот " + номер + " не может пробежать " + distance + " м. Максимум 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + номер + " не умеет плавать.");
    }

    public void поестьИзМиски(int количество) {
        if (количество <= мискаСЕдой) {
            мискаСЕдой -= количество;
            сытость = true;
            System.out.println("Кот " + номер + " поел " + количество + " еды.");
        } else {
            System.out.println("Кот " + номер + ": В миске недостаточно еды для кота.");
        }
    }

    public boolean isСытость() {
        return сытость;
    }

    public int getНомер() {
        return номер;
    }
}

public class animal {
    public static void main(String[] args) {

        Кот[] коты = new Кот[3];
        коты[0] = new Кот(1);
        коты[1] = new Кот(2);
        коты[2] = new Кот(3);

        Собака собака1 = new Собака(1);
        Собака собака2 = new Собака(2);
        Собака собака3 = new Собака(3);
        Собака собака4 = new Собака(4);

        собака1.run(150);
        собака1.swim(5);
        собака2.run(600);

        коты[0].run(150);
        коты[0].swim(5);
        коты[1].run(250);
        коты[2].run(300);

        Кот.добавитьЕдуВМиску(50);

        for (Кот кот : коты) {
            кот.поестьИзМиски(15);
        }
        for (int i = 0; i < коты.length; i++) {
            System.out.println("Кот " + коты[i].getНомер() + " сытость: " + коты[i].isСытость());
        }

        System.out.println("Общее количество животных: " + Животное.getCountЖивотных());
        System.out.println("Количество собак: " + Собака.getCountСобак());
        System.out.println("Количество котов: " + Кот.getCountКотов());
    }
}