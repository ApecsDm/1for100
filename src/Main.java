public class Main {
    public static void main(String[] args) {
        int cash = 100;
        int inflow = 1100;
        int total;
        int bonus = 0;
        if (inflow >= 1000)
            bonus = inflow / 100;
        total = cash + inflow + bonus;
        System.out.println("Баланс:" + total);
        System.out.println("Бонусы:" + bonus);
    }
}