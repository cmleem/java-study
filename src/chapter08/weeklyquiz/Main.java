package chapter08.weeklyquiz;

public class Main {
    public static void main(String[] args) {
        Beauty serum = new Beauty("serum1", 12000, 1);
        Grocery fruit = new Grocery("orange", 35000, 5);
        LargeAppliance tv = new LargeAppliance("tv1", 10000, 20);

        Product[] products = {serum, fruit, tv};
        Cart cart = new Cart(products);
        int deliveryCharge = Calculator.getDeliveryCharge(cart.getTotalWeight(), cart.getTotalPrice());
        System.out.println("총 배송료: " + deliveryCharge);
    }
}
