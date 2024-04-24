public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (!(amount <= 0)) {
            if (this.balance + amount <= this.capacity) {
                this.balance += amount;
            }
        }
    }

    public double takeFromWarehouse(double amount){
        if(amount<0){
            return 0;
        }else if(amount>this.balance){
            return this.balance=0;
        }else{
            this.balance-=amount;
            return amount;
        }
    }
    public String toString(){
        return "Balance: "+""+this.balance+", "+"space left "+howMuchSpaceLeft();
    }
}
