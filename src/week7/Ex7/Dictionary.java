package week7.Ex7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

    public int amountOfWords() {
        return this.translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : this.translations.keySet()) {
            list.add(key + " = " + this.translations.get(key));
        }
        return list;
    }
}
