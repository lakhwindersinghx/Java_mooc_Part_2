
public class Gauge {




    private int meter=10;
    public int m2;

    double getOTP(){
        return meter*Math.random();
    }
    public Gauge(){
        this.meter=0;
    }
    public void increase(){
        if(this.meter<5){
            this.meter++;
        }
    }
    public void decrease(){
        if(this.meter>0){
            this.meter--;
        }
    }
    public int value(){
        return this.meter;
    }
    public boolean full(){
        return (this.meter==5);
    }

}

