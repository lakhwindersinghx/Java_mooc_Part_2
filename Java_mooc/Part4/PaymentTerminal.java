public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money=1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.50){
            this.money=this.money+2.50;
            affordableMeals++;
            return payment = payment - 2.50;

        }else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment>=4.30) {
            this.money=this.money+4.30;
            heartyMeals++;
            return payment = payment - 4.30;
        }else {
            return payment;
        }

    }
    public boolean eatAffordably(CardPayments card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance()>=2.50){
            card.takeMoney(2.50);
            heartyMeals++;
            return true;
        }else {
            return false;
        }
    }

    public boolean eatHeartily(CardPayments card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance()>=4.30){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }else {
            return false;
        }
    }
    public void addMoneyToCard(CardPayments card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }


public String toString() {
    return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;

}
}