import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (dictionary.containsKey(word)) {
            // If it does, add the translation to the existing ArrayList
            dictionary.get(word).add(translation);
        } else {
            // If not, create a new ArrayList and add the translation
            ArrayList<String> translations = new ArrayList<>();
            translations.add(translation);
            dictionary.put(word, translations);

            //or

//            this.dictionary.putIfAbsent(word,new ArrayList<>());
//            dictionary.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }

}
