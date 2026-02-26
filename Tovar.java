import java.util.Date;

public class Tovar {
    private String naziv;
    private Date dataProizvodstva;
    private String proizvoditel;
    private String stranaProiskhozhdeniya;
    private double cena;
    private boolean sostoyanieBronicz;

    public Tovar(String naziv, Date dataProizvodstva, String proizvoditel, String stranaProiskhozhdeniya, double cena, boolean sostoyanieBronicz) {
        this.naziv = naziv;
        this.dataProizvodstva = dataProizvodstva;
        this.proizvoditel = proizvoditel;
        this.stranaProiskhozhdeniya = stranaProiskhozhdeniya;
        this.cena = cena;
        this.sostoyanieBronicz = sostoyanieBronicz;
    }


    public void vyvodInformacii() {
        System.out.println("Информация о товаре:");
        System.out.println("Название: " + naziv);
        System.out.println("Дата производства: " + dataProizvodstva);
        System.out.println("Производитель: " + proizvoditel);
        System.out.println("Страна происхождения: " + stranaProiskhozhdeniya);
        System.out.println("Цена: " + cena + " рублей");
        System.out.println("Состояние бронирования: " + (sostoyanieBronicz ? "Забронировано" : "Не забронировано"));
    }

    public static void main(String[] args) {

        Date data = new Date();
        Tovar tovar = new Tovar("Телевизор", data, "Samsung", "Южная Корея", 1000000.00, false);


        tovar.vyvodInformacii();
    }
}