package task3;


import java.util.HashMap;
import java.util.Map;

public class MyDictionary<Key, Value> {
    Map<Key, Value> dictionary = new HashMap<>();


    public boolean add(Key word, Value translate) {
        dictionary.put(word, translate);
        return true;
    }

    public Value get(Key index) {
        return dictionary.get(index);
    }

    public int getLength() {
        return dictionary.size();
    }
}
