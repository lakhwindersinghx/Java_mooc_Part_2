public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance>= 0) {
            this.balance = this.balance - 2.60;
            if (this.balance < 0) {
                this.balance = 0;
            }
        }
    }

    public void eatHeartily() {
        if (this.balance >= 0) {
            this.balance = this.balance - 4.60;
            if (this.balance < 0) {
                this.balance = 0;
            }
        }
    }


    public void addMoney(double amount) {
        while (true) {
            if (amount < 0) {
                break;
            }
            if (this.balance < 150) {
                this.balance += amount;
                if (this.balance > 150) {
                    this.balance = 150;
                }
            }
            break;
        }
    }

    public String toString() {
        return ("The card has a balance of " + this.balance + " euros.");
    }
}
