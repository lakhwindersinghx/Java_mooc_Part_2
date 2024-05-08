public class DictionaryMain {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("Part11/Dictionary/words.txt");
        dictionary.load();

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");


        dictionary.save();

    }


}
