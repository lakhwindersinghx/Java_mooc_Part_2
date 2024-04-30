import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> cart;
    private int totalPrice;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void add(String product, int price) {
        boolean exist = false;
        for (Item item : this.cart) {
            if (item.getProduct().equals(product)) {
                exist = true;
                item.increaseQuantity();
                break;
            }
        }
        if (!exist) {
            this.cart.add(new Item(product, price));
        }
    }



    public int price () {
                this.totalPrice = 0;
                for (Item product : cart) {
                    this.totalPrice += product.price();
                }
                return totalPrice;
            }
            public void print () {
                for (Item product : cart) {
                    System.out.println(product.toString());
                }
            }
        }
