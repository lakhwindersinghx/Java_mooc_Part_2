import java.util.Map;

public class Item {
    private final String product;
    private Integer qty;
    private final Integer unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.qty = 1;
    }

    public Item(String product, int unitPrice) {
        this(product,1,unitPrice);
    }
    public String getProduct(){
        return this.product;
    }

    public int price() {
        //You get the items price by multiplying its unit price by its quantity(qty).
        return qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return this.product + ": " + this.qty;
    }

    public boolean equals(Object comparedObject){
        if(this==comparedObject){
            return true;
        }
        if(!(comparedObject instanceof Item)){
            return false;
        }
        Item convertedObject=(Item) comparedObject;
        if(this.product.equals(convertedObject.product)&&
           this.qty==convertedObject.qty&&
           this.unitPrice== convertedObject.unitPrice
           );
        return true;
    }

    public int hashCode(){
        int result=17;
        result =31*result+this.qty.hashCode();
        result=31*result+this.unitPrice.hashCode();
        result=31*result+this.product.hashCode();
        return result;
    }
}
