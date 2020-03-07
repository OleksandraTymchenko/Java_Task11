package alex.com.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void addNewWord(String eng, String transl) {
        dictionary.put(eng, transl);
    }

    public String getTranslation(String sentence) {

        String translation = "";

        String[] arr = sentence.split(" ");
        Iterator<Map.Entry<String, String>> itr1 =
                dictionary.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<String, String> entry = itr1.next();
            for (String str : arr) {
                if (str.equals(entry.getKey())) {
                    translation += entry.getValue() + " ";

                }

            }
        }
        System.out.println(translation);
        return translation;
    }

}
