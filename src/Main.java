public class Main {
    public static void main(String[] args) {
        int check = 100; //текущий счет
        int refill = 1500;  //пополнение счета
        int bonus = 0; //бонусы при полнении от 1000 руб.

        if (refill <= 1000) {
            check = check + refill;
            System.out.println("Ваш текущий счет: " + check + " руб.");
            System.out.println("Бонусные рубли: " + bonus + " руб.");
        }

        if (refill > 1000) {
            bonus = (refill / 100);
            check = (check + refill + bonus);
            System.out.println("Ваш текущий счет: " + check + " руб.");
            System.out.println("Бонусные рубли: " + bonus + " руб.");
        }
    }
}