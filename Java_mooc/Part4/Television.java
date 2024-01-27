public class Television {
    private String mname;
    private int duration;
    public Television(String movieName, int movieDuration){
        this.mname=movieName;
        this.duration=movieDuration;
    }
    public int getDuration(){
        return duration;
    }

    public String toString(){
        return "Name: "+this.mname+" Duration: "+this.duration;
    }
}
