public class ProductWarehouseWithHistory extends ProductWarehouse {
    private Double intialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity,double initialBalance) {
        super(productName, capacity);
        this.intialBalance=initialBalance;
    }
    public String history(){
        return super.toString();
    }

}
