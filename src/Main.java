public class Main {
    public static void main(String[] args) {
        int residue = 100;
        int payment = 1100;
        int percent;
        if (payment >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = (payment / 100 * percent);

        int balance = (residue + payment + bonus);

        System.out.println("Остаток на счёте = " + residue + " руб. ");
        System.out.println("Сумма платежа = " + payment + " руб. ");
        if (payment >= 1000) {
            System.out.println("Начислено бонусов = " + bonus + " руб. ");
        }
        System.out.println("Текущий баланс = " + balance + " руб. ");
    }
}