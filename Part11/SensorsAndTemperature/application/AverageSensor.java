package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor{
    ArrayList<Sensor> sensors;
    private List<Integer> readings;

    private Boolean status;

    public AverageSensor(){
        this.sensors=new ArrayList<>();
        this.readings = new ArrayList<>();
        this.status=false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        for(Sensor item:sensors){
            if(item.isOn()){
                this.status=true;
            }
        }
    }

    @Override
    public void setOff() {
        this.status=false;
    }
    public List<Integer> readings(){
        return this.readings;
    }

    @Override
    public int read() {
        int sum=0;
        if(this.sensors.isEmpty()||this.status==false) {
            throw new IllegalStateException("Error b!tch");
        }
        for(Sensor item:this.sensors){
            sum+=item.read();

        }
        this.readings.add(sum/sensors.size());
        return sum/sensors.size();
        }


    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
}
