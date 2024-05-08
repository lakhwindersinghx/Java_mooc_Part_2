import java.util.ArrayList;

public class Pipe <T>{
    private ArrayList<T> pipe;

    public Pipe(){
        this.pipe=new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipe.add(0,value);
    }

    public T takeFromPipe() {
        if (!this.pipe.isEmpty()) {
            return this.pipe.remove(this.pipe.size() - 1);
        }
        return null;
    }

    public boolean isInPipe(){
        return !this.pipe.isEmpty();
    }
}
