package task3;


import java.util.ArrayList;
import java.util.List;

public class MyDictionary<K, V> {
    private final List<Entry<K, V>> dictionary;

    public MyDictionary() {
        this.dictionary = new ArrayList<>();
    }

    public boolean add(K word, V translate) {
        dictionary.add(new Entry<>(word, translate));
        return true;
    }

    public Entry<K, V> get(int index) {
        return dictionary.get(index);
    }

    public int getLength() {
        return dictionary.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyDictionary{");
        sb.append("dictionary=").append(dictionary);
        sb.append('}');
        return sb.toString();
    }

    static class Entry<K, V> {

        private K word;
        private V translate;

        public Entry(K word, V translate) {
            this.word = word;
            this.translate = translate;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            sb.append("word=").append(word);
            sb.append(", translate=").append(translate);
            sb.append('}');
            return sb.toString();
        }

    }
}
