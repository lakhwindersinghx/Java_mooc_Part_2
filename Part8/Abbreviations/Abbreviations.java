import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> meaning;

    public Abbreviations() {
        this.meaning = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.meaning.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.meaning.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (!(this.meaning.get(abbreviation).isEmpty())) {
            return this.meaning.get(abbreviation);
        }
        return null;
    }
}
