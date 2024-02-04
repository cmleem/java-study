package chapter08.weeklyquiz;

public class Main {
    public static void main(String[] args) {
        Beauty serum = new Beauty("serum1", 20000, 1);
        Grocery fruit = new Grocery("orange", 70000, 5);
        LargeAppliance tv = new LargeAppliance("tv1", 500000, 20);

        serum.output();
        fruit.output();
        tv.output();
    }
}
