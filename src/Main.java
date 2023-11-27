public class Main {
    public static void main(String[] args) {

        int amount = 1500;
        int a = 500;
        int resultBonus;

        if (a > 2000) {
            resultBonus = a / 100;
        } else {
            resultBonus = 0;
        }

        System.out.println("Количество бонусных рублей: " + resultBonus);
        System.out.println("Итоговый счет: " + (amount + resultBonus + a));
    }
}