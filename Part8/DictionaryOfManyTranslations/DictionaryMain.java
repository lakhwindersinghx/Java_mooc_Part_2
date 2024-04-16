public class DictionaryMain {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");
        System.out.println(dictionary.translate("lie"));

        dictionary.remove("lie");
        System.out.println(dictionary.translate("lie"));
    }
}
