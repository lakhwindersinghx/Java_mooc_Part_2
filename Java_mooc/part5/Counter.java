public class Counter {
    private int number;
    public Counter(int startValue){
        this.number=startValue;
    }
    public Counter(){
        this.number=0;
    }
    public int value(){
        return this.number;
    }
    public void increase(){
        this.number++;
    }
    public void decrease(){
        this.number--;
    }
    public void increasedBy(int num){
        this.number=this.number+num;
    }
    public  void decreasedBy(int num){
        this.number-=num;
    }
    public String toString(){
        return this.number+"";
    }
}
