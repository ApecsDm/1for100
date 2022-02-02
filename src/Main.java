public class Main {
    public static void main(String[] args) {
        int cash = 100;
        int inflow = 2000;
        int bonus = inflow / 100;
        int limit = 1000;
        int total;
        if (inflow >= limit) {
            total = cash + bonus + inflow;
        } else total = cash + inflow;
        System.out.println(total);
    }

}