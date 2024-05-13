public class YourList<Type> {

    private Type[] values;
    private int firstFreeIndex; //determins the size of list

    public YourList() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; // same as this.firstFreeIndex = this.firstFreeIndex + 1;
    }

    public boolean contains(Type value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

//    public void remove(Type valueToRemove) {
//        boolean found = false;
//        for (int i = 0; i <= this.firstFreeIndex; i++) {
//            if (found) {
//                this.values[i - 1] = this.values[i]; // moving to left
//            } else if (this.values[i].equals(valueToRemove) || this.values[i] == valueToRemove) {
//                this.firstFreeIndex--;
//                found = true;
//            }
//        }
//    }
    public int indexOfValue(Type value){
        for(int i=0;i<this.firstFreeIndex;i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public void moveToLeft(int fromIndex){
        for(int i=0;i<this.firstFreeIndex;i++){
            this.values[i]=this.values[i+1];
        }
    }

    public void remove(Type value){
        int indexOfValue=indexOfValue(value);
        if(indexOfValue<0){
            return;
        }
        moveToLeft(indexOfValue);
        this.firstFreeIndex--;

    }



    public int size() {
        return firstFreeIndex;
    }
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

}