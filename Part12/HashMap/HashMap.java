public class HashMap<K, V> {
    private YourList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new YourList[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(hashCode() % this.values.length); //getting hashValue
        if (this.values[hashValue] == null) { //if nothing exists at acquired hashvalue(acting as index) we return null and
            return null;
        }

        YourList<Pair<K, V>> valueAtIndex = this.values[hashValue]; //there is no value in that index, we create a list into that index.
        for (int i = 0; i < valueAtIndex.size(); i++) { //iterate through element found at hashValue
            if (valueAtIndex.value(i).getKey().equals(key)) { //if the key of the value(i, while iterating) of hashValue list is equal to the parameter Key
                return valueAtIndex.value(i).getValue(); //then return it's value
            }
        }
        return null; //if not, return null
    }

//    public void add(K key, V value) {
//        int hashValue = Math.abs(key.hashCode() % this.values.length);
//        if (this.values[hashValue] == null) {
//            this.values[hashValue] = new YourList<>();
//        }
//        YourList<Pair<K, V>> valuesAtIndex = this.values[hashValue];
//        for (int i = 0; i < valuesAtIndex.size(); i++) {
//            if (valuesAtIndex.value(i).getKey().equals(key)) {
//                valuesAtIndex.value(i).setValue(value);
//            }
//        }
//        valuesAtIndex.add(new Pair<>(key, value));
//        this.firstFreeIndex++;
//    }

    public YourList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new YourList<>();
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

    public void add(V value, K key) {
        YourList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        }
        valuesAtIndex.value(index).setValue(value);
    }

}
