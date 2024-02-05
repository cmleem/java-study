package chapter08.bigdecimal;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;
    static final double LOWER_WEIGHT = 3.0;
    static final double UPPER_WEIGHT = 10.0;
    static final BigDecimal LOWER_PRICE = BigDecimal.valueOf(30000);
    static final BigDecimal UPPER_PRICE = BigDecimal.valueOf(100000);


    public Cart(Product[] products) {
        this.products = products;
    }

    public BigDecimal calculateDeliveryCharge() {
         int totalWeight = 0;
         BigDecimal totalPrice = BigDecimal.ZERO;
         BigDecimal totalDeliveryCharge = BigDecimal.ZERO;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice = totalPrice.add(product.getPrice().subtract(product.getDiscountAmount()));
        }

        if (totalWeight < LOWER_WEIGHT) {
            totalDeliveryCharge = BigDecimal.valueOf(1000);
        } else if (totalWeight < UPPER_WEIGHT) {
            totalDeliveryCharge = BigDecimal.valueOf(5000);
        } else {
            totalDeliveryCharge = BigDecimal.valueOf(10000);
        }

        if (totalPrice.compareTo(LOWER_PRICE) < 0) {
            totalDeliveryCharge = totalDeliveryCharge;
        } else if (totalPrice.compareTo(UPPER_PRICE) < 0) {
            totalDeliveryCharge = totalDeliveryCharge.subtract(BigDecimal.valueOf(1000));
        } else {
            totalDeliveryCharge = BigDecimal.ZERO;
        }
        return totalDeliveryCharge;
    }

}
