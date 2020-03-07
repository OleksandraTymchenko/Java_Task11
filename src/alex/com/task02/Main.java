package alex.com.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addNewWord("sky", "небо");
        dictionary.getDictionary().put("", "");
        dictionary.addNewWord("is", "есть");
        dictionary.addNewWord("blue", "голубое");
        String a = "sky is blue";
        dictionary.getTranslation(a);
    }

}
