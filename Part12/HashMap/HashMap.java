public class HashMap<K, V> {

    private YourList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new YourList[32];
        firstFreeIndex = 0;
    }

    public V getKey(K key) {
        int hashValue = Math.abs(hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        YourList<Pair<K, V>> valuesAtIndex = new YourList<>();
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

//    public void add(K key,V value){
//        int hashValue=Math.abs(hashCode()%this.values.length);
//        if(this.values[hashValue]==null){
//           values[hashValue]=new YourList<>();
//        }
//
//        YourList<Pair<K,V>> valuesAtIndex=new YourList<>();
//        for(int i=0;i<valuesAtIndex.size();i++){
//            if(valuesAtIndex.value(i).getKey().equals(key)){
//               valuesAtIndex.value(i).setValue(value);
//            }
//        }
//
//        valuesAtIndex.add(new Pair<>(key,value));
//        firstFreeIndex++;

    public YourList<Pair<K, V>> getList(K key) {
        int hashValue = Math.abs(hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            values[hashValue] = new YourList<>();
        }
        return values[hashValue];
    }

    public int getIndexOfKey(YourList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void add(K key, V value) {
        YourList<Pair<K, V>> valuesAtIndex = getList(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index > 1) {
            valuesAtIndex.value(index).setValue(value);
        }
        valuesAtIndex.add(new Pair<>(key, value));
        firstFreeIndex++;
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public void grow() {
        YourList<Pair<K, V>>[] newArray = new YourList[this.values.length * 2];
        for (int i = 0; i < this.values.length; i++) { //to go through all the values of current array
            //copy mechanism
            copy(newArray, i);
        }
        this.values = newArray;
    }

    public void copy(YourList<Pair<K, V>>[] newArray, int fromIndex) {
        for (int i = 0; i < this.values[fromIndex].size(); i++) {
            Pair<K, V> value = this.values[fromIndex].value(i);
            int hashValue = Math.abs(hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new YourList<>();
            }
            newArray[hashValue].add(value);
        }
    }
    public V remove(K key){
        YourList<Pair<K,V>> valuesAtIndex=getList(key);
        if(valuesAtIndex.size()==0){
            return null;
        }
        int index=getIndexOfKey(valuesAtIndex,key);
        if(index<0){
            return null;
        }
        Pair<K,V> pair=valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
