package chapter08.dailyquiz;

public class Cart {
   private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalDeliveryCharge = 0;
        int totalPrice = 0, totalWeight = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += product.getPrice() - product.getDiscountAmount();
        }

        if (totalWeight < 3) {
            totalDeliveryCharge = 1000;
        } else if (totalWeight < 10) {
            totalDeliveryCharge = 5000;
        } else {
            totalDeliveryCharge = 10000;
        }

        if(totalPrice >= 100000) {totalDeliveryCharge = 0;}
        else if(totalPrice >= 30000) {totalDeliveryCharge-=1000;}

        return totalDeliveryCharge;
    }
}
