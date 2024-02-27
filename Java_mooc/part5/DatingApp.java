
public class DatingApp {
    private int day;
    private int month;
    private int year;
    private int difference = 0;

    public DatingApp(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public DatingApp afterNumberOfDays(int days) {
        DatingApp newDate = new DatingApp(this.day, this.month, this.year); // Create a new instance with the same date

        // Advance the new date by the specified number of days
        newDate.advance(days);

        return newDate; // Return the new date object
    }

    public void advance(int howManyDays) {
        for(int i=0;i<howManyDays;i++){
            this.advance();
        }
    }

    public void advance() {
        if (this.day == 30) {
            if (this.month == 12) {
                this.year++;
                this.month = 1;
            } else {
                this.month++;
            }
            this.day = 1;
        } else {
            this.day++;
        }
    }



    public boolean before(DatingApp compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
}

