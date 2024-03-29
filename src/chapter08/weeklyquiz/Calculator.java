package chapter08.weeklyquiz;

public class Calculator{
    public static int getDeliveryCharge(int weight, int price) {
        int deliveryCharge;

        if (weight < 3) {
            deliveryCharge = 1000;
        } else if (weight < 10) {
            deliveryCharge = 5000;
        } else{
            deliveryCharge = 10000;
        }

        if (price >= 30000 && price < 100000) {
            deliveryCharge -= 1000;
        } else if (price >= 100000) {
            deliveryCharge = 0;
        }

        return deliveryCharge;
    }
}

