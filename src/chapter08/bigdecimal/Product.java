package chapter08.bigdecimal;

import java.math.BigDecimal;

public class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }
}
