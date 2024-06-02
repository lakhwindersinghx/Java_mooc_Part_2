package VocabularyTraining;

import java.util.*;

public class Dictionary {
    private List<String> words;
    private Map<String, String> translation;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translation = new HashMap<>();
    }

    public String getTranslation(String word) {
        //RETURNS VALUE
        return translation.get(word);
    }

    public void add(String word, String translation) {
        if (!(this.translation.containsKey(word))) {
            this.words.add(word);
        }
        this.translation.put(word, translation);
    }

    public String getRandom() {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("No words in the dictionary");
        }
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));

    }

}
