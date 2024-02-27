public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int newEuro = this.euros + addition.euros;
        int newCent = this.euros + addition.cents;
        Money newMoney = new Money(newEuro, newCent);

        return newMoney;
    }
    public Money minus(Money decreaser) {
        int newEuro = this.euros - decreaser.euros;
        int newCent = this.cents - decreaser.cents;

        // Check if both euros and cents are zero or negative
        if (newEuro <= 0 && newCent <= 0) {
            return new Money(0, 0); // Return zero money
        } else if (newEuro <= 0) {
            return new Money(0, Math.max(0, newCent)); // Return money with zero euros and non-negative cents
        } else if (newCent < 0) {
            // Adjust euros if cents are negative
            newEuro -= 1;
            newCent += 100;
        }

        return new Money(newEuro, newCent);
    }


    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else return false;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}