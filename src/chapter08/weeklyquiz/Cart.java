package chapter08.weeklyquiz;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getTotalWeight() {
        int weight = 0;
        for (Product product : products) {
            weight += product.getWeight();
        }
        return weight;
    }
}
