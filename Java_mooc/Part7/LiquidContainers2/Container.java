public class Container {

    private int litres;

    public Container() {
    this.litres=0;
    }

    public int contains() {
        return this.litres;
    }

    public void add(int amount) {
        this.litres += amount;
        if(this.litres>100){
            this.litres=100;
        }
    }
    public void move(int amount,Container other) {
        // Transfer liquid from first container to second container
        int transferAmount = Math.min(amount, this.litres);
        this.remove(transferAmount);
        other.add(transferAmount);;
    }
    public void remove(int amount) {
        this.litres -= amount;
        if (this.litres < 0) {
            this.litres = 0;
        }
    }

    public String toString() {
        return this.litres + "/100";
    }
}


