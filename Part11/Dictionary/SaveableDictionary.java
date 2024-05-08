import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {
    Map<String, String> dictionary;
    private String file;

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;

    }

    public void add(String words, String translation) {

        if (!(dictionary.containsKey(words))) {
            this.dictionary.put(words, translation);
            this.dictionary.put(translation, words);
        }
    }

    public String translate(String word) {
//        return this.dictionary.getOrDefault(word,null);
        if (this.dictionary.containsValue(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else
            return null;
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            dictionary.remove(word); // Remove the key-value pair
            dictionary.remove(translation); // Remove the value-key pair
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                String[] splits = row.split(":");
                this.dictionary.put(splits[0], splits[1]);
                this.dictionary.put(splits[1], splits[0]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String item : this.dictionary.keySet()) {
                String translation = this.dictionary.get(item);

                boolean translationWritten = false;
                for (String word : this.dictionary.keySet()) {
                    if (word.equals(translation) && this.dictionary.get(word).equals(item)) {
                        translationWritten = true;
                        break;
                    }
                }
                // Move the writing of the translation outside of the inner loop
                if (!translationWritten) {
                    writer.println(item + ":" + translation);
                }
                // Always write the item and its translation
//                writer.println(item + ":" + this.dictionary.get(item));
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}

