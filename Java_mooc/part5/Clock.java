public class Clock {
    private ClockHand hour;
    private ClockHand minute;
    private ClockHand seconds;
    private int hoursPassed;

    public Clock() {
        this.hour = new ClockHand(24);
        this.minute = new ClockHand(60);
        this.seconds = new ClockHand(60);
        this.hoursPassed=0;
    }

    public void advance() {
        this.seconds.advance();
        if (this.seconds.value() == 0) {
            this.minute.advance();

            if (this.minute.value() == 0) {
                this.hour.advance();
                this.hoursPassed++;
            }
        }
    }
    public boolean hasPassed(){
        return this.hoursPassed>=24;
    }
    public ClockHand getHour(){
        return this.hour;
    }
    public String toString(){
        return this.hour+":"+this.minute+":"+this.seconds;
    }
}

